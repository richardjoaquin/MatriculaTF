package com.matricula.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.matricula.model.entity.Account;
import com.matricula.model.entity.Student;
import com.matricula.model.repository.StudentRepository;
import com.matricula.service.StudentService;
import com.matricula.service.UserService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private UserService userService;

	@Override 
	public List<Student> getAllStudents() {	
		List<Student> students =new ArrayList<>();
		studentRepository.findAll().iterator().forEachRemaining(students::add);
		return students;
	}

	@Override //
	public Student createStudent(Student student) {
		Student newStudent;
		newStudent = studentRepository.save(student);
		return newStudent;
	}

	@Override
	public Student updateStudent(Long id, Student studentDetails) {
		Student student = findById(id);
		student.setAccount(studentDetails.getAccount());
		student.setCareer(studentDetails.getCareer());
		student.setLastName(studentDetails.getLastName());
		student.setName(studentDetails.getName());
		student.setSemester(studentDetails.getSemester());
		student.setCorreo(studentDetails.getCorreo());
		student.setModalidad(studentDetails.getModalidad());
		student.setEstado(studentDetails.getEstado());
		studentRepository.save(student);
		return student;
	}

	@Override
	public Student findById(Long id) {
		Student student = studentRepository.fetchById(id);
		return student;
	}
	
	@Override
	public List<Student> finddById(Long id) {
		List<Student> students = studentRepository.fetchhById(id);
		return students;
	}

	@Override
	public Student getLatestEntry() {
		List<Student> students = getAllStudents();
		if (students.isEmpty()) {
			return null;
		} else {
			Long latestStudentID = studentRepository.findTopByOrderByIdDesc();
			return findById(latestStudentID);}
	}

	@Override
	public Student findStudentByAccount(Long id){
		Student student;
		Account account=userService.getLoggedUser();
		student=studentRepository.findStudentByAccount(account.getId());
		return student;
	}

	@Override
	public List<Student> findStudentOnStudentCourses() {
		return studentRepository.findStudentOnStudentCourses();
	}

	@Override
	public List<Student> fecthStudentByMC(String estado, String career) throws Exception {
	return studentRepository.fecthStudentByMC(estado, career);
	}
	
	@Override
	public List<Student> fecthStudentByMCEX(String estado, String career) throws Exception {
	return studentRepository.fecthStudentByMCEX(estado, career);
	}
}
