package com.matricula.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.matricula.model.entity.Account;
import com.matricula.model.entity.Course;
import com.matricula.model.entity.Student;
import com.matricula.model.repository.CourseRepository;
import com.matricula.service.CourseService;
import com.matricula.service.UserService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@Override
	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<>();
		courses=courseRepository.findAll();
		return courses;
	}

	@Override
	public Course createCourse(Course course) {
		Course newCourse=courseRepository.save(course);
		return newCourse;
	}

	@Override
	public Course updateCourse(Long id, Course courseDetails) {
		Course course=findById(id);
		course.setName(courseDetails.getName());
		course.setAmount(courseDetails.getAmount());
		course.setProfessor(courseDetails.getProfessor());
		course.setCareer(courseDetails.getCareer());
		course.setSemester(courseDetails.getSemester());
		course.setDay(courseDetails.getDay());
		course.setStartTime(courseDetails.getStartTime());
		course.setEndTime(courseDetails.getEndTime());
		courseRepository.save(course);
		return course;
	}

	@Override
	public Course findById(Long id) {
	Course course=courseRepository.fetchById(id);
	return course;
	}

	@Override
	public Course getLatestEntry() {
		List<Course> courses = getAllCourses();
		if (courses.isEmpty()) {
			return null;
		} else {
			Long latestCourseID = courseRepository.findTopByOrderByIdDesc();
			return findById(latestCourseID);
		}
	}

	
	@Override
	public List<Course> findByName(String name) {
		List<Course> courses=courseRepository.findByName(name);
		return courses;
	}

	@Override
	public List<Course> findCoursesAvailables() {
		Account account=userService.getLoggedUser();
		Student student=studentServiceImpl.findStudentByAccount(account.getId()); 
		return courseRepository.findCoursesAvailables(student.getCareer() , student.getSemester());
	}

	@Override
	public List<Course> findCourseOnStudentCourses() {
		return courseRepository.findCoursesOnStudentCourse();
	}
}
