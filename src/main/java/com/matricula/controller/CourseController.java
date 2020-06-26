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

import com.matricula.model.entity.Course;
import com.matricula.model.entity.Professor;
import com.matricula.service.CourseService;
import com.matricula.service.ProfessorService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private ProfessorService professorService;
	
	private Course courseToEdit;
	private Professor professor;
	
	//Alumno
	@GetMapping("/listCDisponibles")
	public String showAllCoursesAvailables(Model model) throws Exception {
	try {
		model.addAttribute("courses", courseService.findCoursesAvailables());
		} catch(Exception e) {
		model.addAttribute("error",e.getMessage());
	}
		return "courses/listCDisponibles";
	}
	
	//Admin
	@GetMapping("/list")
	public String showAllCourses(Model model) throws Exception {
		try {
		model.addAttribute("courses", courseService.getAllCourses());
		model.addAttribute("coursesToSearch", courseService.getAllCourses());
		} catch(Exception e) {
		model.addAttribute("error",e.getMessage());
	}
		return "courses/list";
	}
	
	@GetMapping("/new")
	public String newCourseForm(Model model) throws Exception{
		try {
		model.addAttribute("course", new Course());
		professor=new Professor();
		model.addAttribute("professor", professor); //CAMBIO HECHO
		List<Professor> professors = professorService.getAllProfessorsAvailable();
		model.addAttribute("professors", professors);
		return "courses/new";
		}catch(Exception e) {
			model.addAttribute("error", e.getMessage());
			return "redirect:/courses/list";
		}
	}
	
	@PostMapping("/save")
	public String saveNewCourse(Course course, Model model) throws Exception {
		if(!course.getName().isEmpty() && !course.getStartTime().isEmpty() && !course.getEndTime().isEmpty()) {
					courseService.createCourse(course);
					model.addAttribute("success", "Curso guardado con exito");
					model.addAttribute("courses", courseService.getAllCourses());
					return "redirect:/courses/list";
		} else {
			model.addAttribute("error", "Completar todos los campos");
			List<Professor> professors = professorService.getAllProfessorsAvailable();
			model.addAttribute("professors", professors);
			return "courses/new";
		}
	}
	
	@GetMapping("/edit/{id}")
    public String editCourseForm(@PathVariable("id") long id, Model model) throws Exception {
        courseToEdit = courseService.findById(id);
        model.addAttribute("course", courseToEdit);
        model.addAttribute("professors", professorService.getAllProfessorsAvailable());
        return "courses/edit";
    }
	
	@PostMapping("/update/{id}")
    public String updateCourse(@PathVariable("id") long id, Course course,Model model) throws Exception {
		if(course.getName().isEmpty()==false && course.getStartTime().isEmpty()==false && course.getEndTime().isEmpty()==false) {
		courseService.updateCourse(id, course);
        model.addAttribute("success", "Curso guardado con exito");
		model.addAttribute("courses", courseService.getAllCourses());
		return "/courses/list";
		} else {
			model.addAttribute("error","Completar todos los campos");
			model.addAttribute("course", courseToEdit);
			model.addAttribute("professors", professorService.getAllProfessorsAvailable());
			return "courses/edit";
		}
	}
	
	@GetMapping("/search")
	public String searchCourseByName(@RequestParam("filterName") String filterName, Model model) throws Exception {
			
			if (!filterName.isEmpty()) {
				List<Course> courses = courseService.findByName(filterName);
				if (!courses.isEmpty()) {
					model.addAttribute("info", "Busqueda realizada correctamente");
					model.addAttribute("courses", courses);
					model.addAttribute("coursesToSearch", courseService.getAllCourses());
					return "courses/list";
				} else {
					model.addAttribute("info", "No existe el curso");
					model.addAttribute("coursesToSearch", courseService.getAllCourses());
					return "courses/list";
				}
			} else {
				model.addAttribute("error", "Completar el campo de búsqueda");
				model.addAttribute("coursesToSearch", courseService.getAllCourses());
				return "courses/list";
			}
	}
}
