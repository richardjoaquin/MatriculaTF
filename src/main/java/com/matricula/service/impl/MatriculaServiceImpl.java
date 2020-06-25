package com.matricula.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matricula.model.entity.Matricula;
import com.matricula.model.repository.MatriculaRepository;
import com.matricula.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Override
	public List<Matricula> getAllMatriculas() {
		List<Matricula> matriculas =new ArrayList<>();
		matriculaRepository.findAll().iterator().forEachRemaining(matriculas::add);
		return matriculas;
	}

	@Override
	public List<Matricula> findAlumnodById(Long id) {
		List<Matricula> matriculas = matriculaRepository.AlumnoById(id);
		return matriculas;
	}

	@Override
	public Matricula updateMatricula(Long id, Matricula matricula) {
		Matricula matri_enco = findMatriculaByID(id);
		matri_enco.setNcursos(matricula.getNcursos());
		matriculaRepository.save(matri_enco);
		return matri_enco;
	}

	@Override
	public List<Matricula> fecthSemestreByESEX(String estado, int semestre) throws Exception {
		return matriculaRepository.fecthSemestreByESEX(estado, semestre);
	}

	@Override
	public List<Matricula> fecthSemestreByES(String estado, int semestre) throws Exception {
	return matriculaRepository.fecthSemestreByES(estado, semestre);
	}

	@Override
	public Matricula findMatricula(Long id_alum, int semestre) throws Exception {
		return matriculaRepository.findMatricula(id_alum, semestre);
	}

	@Override
	public Matricula findMatriculaByID(Long id) {
	return matriculaRepository.findMatriculaByID(id);
	}

}
