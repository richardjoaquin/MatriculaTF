package com.matricula.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.matricula.model.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
	
	@Query("SELECT m FROM Matricula m WHERE m.student.id=?1")
	List<Matricula> AlumnoById(Long id);
	
	@Query("SELECT m from Matricula m where m.estado like ?1 and m.enrollment.semester=?2")
	List<Matricula> fecthSemestreByESEX(String estado, int semestre);
	
	@Query("SELECT m from Matricula m where m.estado like ?1 or m.enrollment.semester=?2")
	List<Matricula> fecthSemestreByES(String estado, int semestre);
	
	@Query("SELECT m from Matricula m where m.student.id = ?1 and m.enrollment.semester = ?2")
	Matricula findMatricula(Long id_alum, int semestre);
	
	@Query("SELECT m from Matricula m where m.id = ?1")
	Matricula findMatriculaByID(Long id);
}
