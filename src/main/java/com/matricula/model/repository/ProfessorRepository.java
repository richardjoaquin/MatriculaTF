package com.matricula.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.matricula.model.entity.Professor;

@Repository
public interface ProfessorRepository  extends JpaRepository <Professor, Long> {

    @Query("SELECT MAX(id) FROM Professor")
    Long findTopByOrderByIdDesc();

    @Query("SELECT p FROM Professor p WHERE p.id=?1")
    Professor fetchById(Long id);
    
    @Query("SELECT p FROM Professor p WHERE p.id=?1")
    List<Professor> fetchhById(Long id);
    
    @Query("SELECT c.professor FROM Course c")
    List<Professor> findProfessorsOnCourse();
    
    @Query("SELECT p FROM Professor p WHERE p.estado=?1")
    List<Professor> findProfessorsAvailable(String contratado);
    
    @Query("SELECT p from Professor p where p.estado like ?1 or p.cargo like ?2")
	 List<Professor> fecthProfessorByMC(String estado, String cargo);
	  
	@Query("SELECT p from Professor p where p.estado like ?1 and p.cargo like ?2")
	List<Professor> fecthProfessorByMCEX(String estado, String cargo);
    
}