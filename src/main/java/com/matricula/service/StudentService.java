
package com.matricula.service;

import java.util.List;
import com.matricula.model.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	List<Student> findStudentOnStudentCourses();
	
	Student createStudent(Student student);
	
	Student updateStudent(Long id, Student student);
	
	void deleteStudent(Long incidentId);
	
	Student findById(Long id);
	
	List<Student> finddById(Long id);
	
	Student getLatestEntry();
	
	Student findStudentByAccount(Long id);
   
	List<Student> fecthStudentByMC(String estado, String career) throws Exception;

	List<Student> fecthStudentByMCEX(String estado, String career) throws Exception;
}