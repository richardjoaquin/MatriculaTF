package com.matricula.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.matricula.model.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	@Query("SELECT MAX(id) FROM Student")
    Long findTopByOrderByIdDesc();

	@Query("SELECT s FROM Student s WHERE s.id=?1")
	Student fetchById(Long id);
	
	@Query("SELECT s FROM Student s WHERE s.id=?1")
	List<Student> fetchhById(Long id);
	
	 @Query("SELECT s FROM Student s WHERE s.account.id=?1")
	 Student findStudentByAccount(Long accountId);
	 
	 @Query("SELECT sc.student FROM StudentCourse sc")
	 List<Student> findStudentOnStudentCourses();
	 
	 @Query("SELECT s from Student s where s.estado like ?1 or s.career like ?2")
	 List<Student> fecthStudentByMC(String estado, String career);
	  
	 @Query("SELECT s from Student s where s.estado like ?1 and s.career like ?2")
	 List<Student> fecthStudentByMCEX(String estado, String career);
}