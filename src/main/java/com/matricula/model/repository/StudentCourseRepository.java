package com.matricula.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.matricula.model.entity.StudentCourse;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long> {
	
	@Query("select sc from StudentCourse sc where sc.enrollment.semester=?1 AND sc.student.id=?2")
	List<StudentCourse> fetchStudentCourseBySemester(Integer semester,Long studentId);

	//Query para Alumno: Validar que ya esta matriculado en un curso
	@Query("SELECT sc FROM StudentCourse sc WHERE sc.course.id=?1 AND sc.student.id=?2")
	List<StudentCourse> CourseStudentRegistered(Long idCourse, Long studentId);
	
	@Query("SELECT sc FROM StudentCourse sc WHERE sc.id=?1")
	StudentCourse fetchById(Long scId);
}
