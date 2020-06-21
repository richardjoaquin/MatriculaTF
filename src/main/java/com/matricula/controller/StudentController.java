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

import com.matricula.model.entity.Account;
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
	
	/**@Autowired
	private AccountService accountService;*/
	
	private Student student; 
	private Account account;
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
					model.addAttribute("info", "No existe el codigo del alumno");
					model.addAttribute("students", students);
					return "students/list";
				}
			} else {
				model.addAttribute("students", students);
				model.addAttribute("error", "Completar el campo de busqueda");
				return "students/list";
			}
	
		//return students;
	}
	
	@GetMapping("/new")
	public String newStudent(Model model){
		
		model.addAttribute("student", new Student());
		//account = new Account();
		//List<Account> accounts = accountService.getAllAccounts();
		//model.addAttribute("accounts", accounts);
		return "students/new";
	}
	
	@PostMapping("/save")
	public String createStudentForm(Student student, Model model) throws Exception {
		if(student.getName().isEmpty()==false && student.getLastName().isEmpty()==false && student.getCorreo().isEmpty()==false) {
		numerator++;
		//Long numerator=1L;
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
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") Long id, Model model) throws Exception {
		
		if(!studentService.findStudentOnStudentCourses().contains(studentService.findById(id))) {
			studentService.deleteStudent(id);
			//professorService.deleteProfessor(professorService.findById(id).getId());
			model.addAttribute("success", "Estudiante eliminado correctamente");
			model.addAttribute("students", studentService.getAllStudents());
			return "students/list";
			}else {
				model.addAttribute("error", "El alumno se encuentra matriculado en uno o mas cursos");
				model.addAttribute("students", studentService.getAllStudents());
				return "students/list";
			}
	}
	
}
