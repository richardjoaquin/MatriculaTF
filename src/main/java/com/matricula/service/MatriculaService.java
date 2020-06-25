package com.matricula.service;

import java.util.List;

import com.matricula.model.entity.Matricula;

public interface MatriculaService {

	List<Matricula> getAllMatriculas();
	
	List<Matricula> findAlumnodById(Long id);
	
	Matricula updateMatricula(Long id, Matricula matricula);
	
	List<Matricula> fecthSemestreByESEX(String estado, int semestre) throws Exception;

	List<Matricula> fecthSemestreByES(String estado, int semestre) throws Exception;
	
	Matricula findMatricula(Long id_alum, int semestre) throws Exception;
	
	Matricula findMatriculaByID(Long id);
	
}
