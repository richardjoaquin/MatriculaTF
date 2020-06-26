package com.matricula.service;

import java.util.List;
import com.matricula.model.entity.Course;


public interface CourseService {

	List<Course> getAllCourses();
	
	List<Course> findCourseOnStudentCourses();
	
	Course createCourse(Course course);
	
	Course updateCourse(Long id, Course course);
	
	Course findById(Long id);
	
	Course getLatestEntry();
	
	List<Course> findByName(String name);
    
    List<Course> findCoursesAvailables();          
}
