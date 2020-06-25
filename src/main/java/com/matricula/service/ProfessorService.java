package com.matricula.service;

import java.util.List;
import com.matricula.model.entity.Professor;

public interface ProfessorService {
	
	List<Professor> getAllProfessors();
	
	Professor createProfessor(Professor professor);
	
	Professor updateProfessor(Long id, Professor professor);
	
	Professor findById(Long id);
	
	List<Professor> finddById(Long id);

	Professor getLatestEntry();
	
	List<Professor> findProfessorOnCourse();
	
	List<Professor> getAllProfessorsAvailable();
	
	List<Professor> fecthProfessorByMC(String estado, String cargo) throws Exception;

	List<Professor> fecthProfessorByMCEX(String estado, String cargo) throws Exception;

}
