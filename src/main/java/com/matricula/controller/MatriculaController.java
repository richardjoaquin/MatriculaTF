package com.matricula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matricula.model.entity.Matricula;
import com.matricula.service.MatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private MatriculaService matriculaService;
	
	private List<Matricula> matriculas;
	
	@GetMapping("/list")
	public String showAllMatriculas(Model model)throws Exception{
		try {
			model.addAttribute("matriculas", matriculaService.getAllMatriculas());
		}catch (Exception e){
			model.addAttribute("error",e.getMessage());
		}
		return "matriculas/list";
	}
	
	public List<Matricula> searchStudent(String filter, Model model){
		try {
			if(!filter.isEmpty()) {
				Long id= Long.parseLong(filter);
				matriculas=matriculaService.findAlumnodById(id);
				if (!matriculas.isEmpty())
				{
					model.addAttribute("succes", "Se realizo correctamente la busqueda");
					model.addAttribute("matriculas",matriculas);
				} else {
					model.addAttribute("info", "No existe el codigo del alumno");
					model.addAttribute("matriculas",matriculaService.getAllMatriculas());
				}
			}
			else {
				model.addAttribute("matriculas",matriculaService.getAllMatriculas());
				model.addAttribute("error", "Completar el campo de busqueda");
			}
		}catch(Exception e){
			model.addAttribute("Error Matricula: ", e.getMessage());
		}
		return matriculas;
	}
	
	@GetMapping("/searchStudent")
	private String searchStudentById(@RequestParam("filterId") String filterId, Model model) throws Exception{
		if (!filterId.isEmpty()) {
		model.addAttribute("matriculas",searchStudent(filterId, model));
		return "matriculas/list";
		}
		else
		{
			model.addAttribute("matriculas",matriculaService.getAllMatriculas());
			model.addAttribute("error", "Completar el campo de busqueda");
			return "matriculas/list";
		}
	}
	
	public List<Matricula> searchSemestre(String estado, String semestre, Model model)
	{
		try {
			if(!estado.isEmpty() && !semestre.isEmpty()) {
				int sem = Integer.parseInt(semestre);
				matriculas= matriculaService.fecthSemestreByESEX(estado, sem);
				if(!matriculas.isEmpty())
				{
					model.addAttribute("info", "Busqueda realizada correctamente");
				    model.addAttribute("matriculas", matriculas);
				}else {
					model.addAttribute("info", "No se han encontrado coincidencias");
					model.addAttribute("matriculas", matriculaService.getAllMatriculas());
				}
			} else if(!estado.isEmpty() && semestre.isEmpty()) {
				int sem = Integer.parseInt(semestre);
				matriculas=matriculaService.fecthSemestreByES(estado, sem);
				if(!matriculas.isEmpty())
				{
					model.addAttribute("info", "Busqueda realizada correctamente");
				    model.addAttribute("matriculas", matriculas);
				}else {
					model.addAttribute("info", "No se han encontrado coincidencias");
					model.addAttribute("matriculas", matriculaService.getAllMatriculas());
				}
			} else if (estado.isEmpty() && !semestre.isEmpty()) {
				int sem = Integer.parseInt(semestre);
				matriculas=matriculaService.fecthSemestreByES(estado, sem);
				if(!matriculas.isEmpty())
				{
					model.addAttribute("info", "Busqueda realizada correctamente");
				    model.addAttribute("matriculas", matriculas);
				}else {
					model.addAttribute("info", "No se han encontrado coincidencias");
					model.addAttribute("matriculas", matriculaService.getAllMatriculas());
				}
			} else {
				model.addAttribute("matriculas", matriculaService.getAllMatriculas());
				model.addAttribute("error", "Completar algún campo de búsqueda");
			}
		}catch (Exception e){
			model.addAttribute("Error Matricula: ", e.getMessage());
		}
		return matriculas;
	}
	
	@GetMapping("/searchSemestreAll")
	public String searchSemestreyByAll(@RequestParam("estado") String estado, @RequestParam("semestre") String semestre, Model model){
		if((!estado.isEmpty() && !semestre.isEmpty()) ||(!estado.isEmpty() && semestre.isEmpty()) || (estado.isEmpty() && !semestre.isEmpty())) {
			model.addAttribute("matriculas", searchSemestre(estado, semestre, model));
			return "matriculas/list";
		}else
		{
			model.addAttribute("matriculas", matriculaService.getAllMatriculas());
			model.addAttribute("error", "Completar algún campo de búsqueda");
			return "matriculas/list";
		}
	}
	
	public MatriculaService getMatriculaService() {
		return matriculaService;
	}

	public void setMatriculaService(MatriculaService matriculaService) {
		this.matriculaService = matriculaService;
	}	
}
