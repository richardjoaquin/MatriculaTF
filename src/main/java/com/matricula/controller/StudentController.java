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
import com.matricula.model.entity.Student;
import com.matricula.service.StudentService;
import com.matricula.service.UserService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService; 
	
	@Autowired
	private UserService userService; 
	private Student studentToEdit;
	private List<Student> students; 
	private Long numerator=(long) 2;
	
	@GetMapping("/list")
	public String showAllStudents(Model model) throws Exception{
		
		try {
			model.addAttribute("students", studentService.getAllStudents());
			
			} catch(Exception e) {
			model.addAttribute("error",e.getMessage());
		}
			return "students/list";
		
	}
	
	@GetMapping("/searchStudent")
	public String searchStudentById(@RequestParam("filterId") String filterId, Model model) {
	
			if (!filterId.isEmpty()) {
				Long id= Long.parseLong(filterId);
				students = studentService.finddById(id);
				if (!students.isEmpty()) {
					model.addAttribute("succes", "Se realizo correctamente la busqueda");
					model.addAttribute("students", students);
					return "students/list";
				} else {
					model.addAttribute("error", "No existe el codigo del alumno");
					model.addAttribute("students", studentService.getAllStudents());
					return "students/list";
				}
			} else {
				model.addAttribute("students", studentService.getAllStudents());
				model.addAttribute("error", "Completar el campo de busqueda");
				return "students/list";
			}
	}
	
	public List<Student> searchStudentBy2(String estado, String career, Model model)
	{
		try {
			if(!estado.isEmpty() && !career.isEmpty())
			{			
				students = studentService.fecthStudentByMCEX(estado, career);		
			    if(!students.isEmpty()) {
			    model.addAttribute("info", "Busqueda realizada correctamente");
			    model.addAttribute("students", students);	}
			    else {
				model.addAttribute("info", "No se han encontrado coincidencias");
				model.addAttribute("students", studentService.getAllStudents());
			    }
			} else if(!estado.isEmpty() && career.isEmpty()) {				
				students = studentService.fecthStudentByMC(estado, career);		
			    if(!students.isEmpty()){
			    model.addAttribute("students", students);	
				model.addAttribute("info", "Busqueda realizada correctamente");
				}   else {
					model.addAttribute("info", "No se han encontrado coincidencias");
					model.addAttribute("students", studentService.getAllStudents());
				    }
		    } else if (estado.isEmpty() && !career.isEmpty()) {		    	
				students = studentService.fecthStudentByMC(estado, career);
			    if(!students.isEmpty())
				{model.addAttribute("students", students);
				 model.addAttribute("info", "Busqueda realizada correctamente");
				}else {
					model.addAttribute("info", "No se han encontrado coincidencias");
					model.addAttribute("students", studentService.getAllStudents());
				    }
		    } else {
				model.addAttribute("students", studentService.getAllStudents());
				model.addAttribute("error", "Completar el campo de búsqueda");
		    }
	}catch(Exception e){
		model.addAttribute("Error Student: ", e.getMessage());
	}
		return students;
	}
	
	@GetMapping("/searchStudentALL")
	public String searchStudentByAll(@RequestParam("estado") String estado, @RequestParam("career") String career, Model model){
		if((!estado.isEmpty() && !career.isEmpty()) ||(!estado.isEmpty() && career.isEmpty()) || (estado.isEmpty() && !career.isEmpty()) ){
		model.addAttribute("students", searchStudentBy2(estado, career, model));
		return "students/list";
		}else{
			model.addAttribute("students", studentService.getAllStudents());
			model.addAttribute("error", "Completar algún campo de búsqueda");
			return "students/list";
		}
	}
	
	@GetMapping("/new")
	public String newStudent(Model model){	
		model.addAttribute("student", new Student());
		return "students/new";
	}
	
	@PostMapping("/save")
	public String createStudentForm(Student student, Model model) throws Exception {
		if(student.getName().isEmpty()==false && student.getLastName().isEmpty()==false && student.getCorreo().isEmpty()==false) {
		numerator++;
		student.setAccount(userService.findById(numerator));
		studentService.createStudent(student);
		model.addAttribute("students", studentService.getAllStudents());
		model.addAttribute("success", "Alumno guardado con exito");
		return "students/list";
		} else {
			model.addAttribute("error", "Completar todos los campos");
			return "students/new";
		}
	}
	
	@GetMapping("/edit/{id}")
    public String editStudentForm(@PathVariable("id") Long id, Model model) throws Exception {
        studentToEdit = studentService.findById(id);
        model.addAttribute("student", studentToEdit);
        return "students/edit";
    }
	
	@PostMapping("/update/{id}")
    public String updateStudent(@PathVariable("id") Long id, Student student, Model model) throws Exception {
		if(student.getName().isEmpty()==false && student.getLastName().isEmpty()==false && student.getCorreo().isEmpty()==false) {
        studentService.updateStudent(id, student);
        model.addAttribute("success", "Alumno guardado con exito");
        model.addAttribute("students", studentService.getAllStudents());
        return "students/list";    
		} else {
			model.addAttribute("error","Completar todos los campos");
			model.addAttribute("student", studentToEdit);
			return "students/edit";
		}
    }	
}
