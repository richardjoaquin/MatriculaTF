package com.matricula.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.matricula.model.entity.Professor;
import com.matricula.service.ProfessorService;

@Controller
@RequestMapping("/professors")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	private List<Professor> professors;
	
	private Professor professorToEdit;
	
	@GetMapping("/list")
	public String showAllProfessors(Model model) throws Exception {
		try {
		model.addAttribute("professors", professorService.getAllProfessors());
		} catch(Exception e) {
		model.addAttribute("error",e.getMessage());
	}
		return "professors/list";
	}
	
	@GetMapping("/new")
	public String newProfessor(Model model) throws Exception{
		
		try {
		model.addAttribute("professor", new Professor());
		}catch (Exception e){
			model.addAttribute("info", e.getMessage());
		}
		return "professors/new";
	}
	
	@PostMapping("/save")
	public String createProfessorForm(Professor professor, Model model) throws Exception {
		
		if(professor.getName().isEmpty()==false && professor.getLastName().isEmpty()==false) {
		professorService.createProfessor(professor);
		model.addAttribute("success", "Profesor guardado con exito");
		model.addAttribute("professors", professorService.getAllProfessors());
		return "professors/list";
		} else {
			model.addAttribute("error", "Completar todos los campos");
			return "professors/new";
		}
	}
	
	@GetMapping("/edit/{id}")
    public String editProfessorForm(@PathVariable("id") Long id, Model model) throws Exception {
        professorToEdit=professorService.findById(id);
		model.addAttribute("professor", professorToEdit);
        return "professors/edit";
    }
	
	@PostMapping("/update/{id}")
    public String updateProfessor(@PathVariable("id") Long id, Professor professor, Model model) throws Exception {
		
		if(professor.getName().isEmpty()==false && professor.getLastName().isEmpty()==false) {
        professorService.updateProfessor(id, professor);
        model.addAttribute("success", "Profesor guardado con exito");
        model.addAttribute("professors", professorService.getAllProfessors());
       	return "professors/list"; 
		
		} else {
			model.addAttribute("error","Completar todos los campos");
			model.addAttribute("professor", professorToEdit);
			return "professors/edit";
		}
    }
	
	@GetMapping("/delete/{id}")
	public String deleteProfessor(@PathVariable("id") Long id, Model model) throws Exception {
		
		if(!professorService.findProfessorOnCourse().contains(professorService.findById(id))) {
		professorService.deleteProfessor(id);
		//professorService.deleteProfessor(professorService.findById(id).getId());
		model.addAttribute("success", "Profesor eliminado correctamente");
		model.addAttribute("professors", professorService.getAllProfessors());
		return "professors/list";
		}else {
			model.addAttribute("error", "El profesor pertenece a un curso");
			model.addAttribute("professors", professorService.getAllProfessors());
			return "professors/list";
		}
	}
	
	@GetMapping("/search")
	public String searchProfessorById(@RequestParam("filterId") String filterId, Model model) throws Exception {

			if (!filterId.isEmpty()) {
				
				Long id = Long.parseLong(filterId);
				professors=professorService.finddById(id);
				if (!professors.isEmpty()) {
					model.addAttribute("professors", professors);
					model.addAttribute("success", "Se realizo correctamente la busqueda");
					return "professors/list";
				} else {
					model.addAttribute("info", "No existe el codigo del profesor");
					model.addAttribute("professors", professorService.getAllProfessors());
					return "professors/list";
				}
			} else {
				model.addAttribute("error", "Ingrese el codigo del profesor");
				model.addAttribute("professors", professorService.getAllProfessors());
				return "professors/list";
			}
			//return professors;
	} 
	
	public List<Professor> searchProfessorBy2(String estado, String cargo, Model model)
	{
		try {
			if(!estado.isEmpty() && !cargo.isEmpty())
			{
				model.addAttribute("info", "Busqueda realizada correctamente");
				professors = professorService.fecthProfessorByMCEX(estado, cargo);
			
			    if(!professors.isEmpty())
			    model.addAttribute("professors", "professors");			
			    else {
				model.addAttribute("info", "No se han encontrado coincidencias");
				model.addAttribute("professors", professorService.getAllProfessors());
			    }
			}
			else if(!estado.isEmpty() && cargo.isEmpty()) {
				model.addAttribute("info", "Busqueda realizada correctamente");
				professors = professorService.fecthProfessorByMC(estado, cargo);
			
			    if(!professors.isEmpty())
				model.addAttribute("professors", "professors");	    
		    }
			else if (estado.isEmpty() && !cargo.isEmpty()) {
		    	model.addAttribute("info", "Busqueda realizada correctamente");
				professors = professorService.fecthProfessorByMC(estado, cargo);
			
			    if(!professors.isEmpty())
				model.addAttribute("professors", "professors");	 
		    }
			else {
				model.addAttribute("professor", professorService.getAllProfessors());
				model.addAttribute("error", "Debe completar el campo de búsqueda");
		    }
	}catch(Exception e){
		model.addAttribute("Error Student: ", e.getMessage());
	}
		return professors;
	}
	
	@GetMapping("/searchProfessorALL")
	public String searchProfessorByAll(@RequestParam("estado") String estado, @RequestParam("cargo") String cargo, Model model){
		model.addAttribute("professors", searchProfessorBy2(estado, cargo, model));
		return "professors/list";
	}

	public ProfessorService getProfessorService() {
		return professorService;
	}

	public void setProfessorService(ProfessorService professorService) {
		this.professorService = professorService;
	}

	public List<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}
	
}
