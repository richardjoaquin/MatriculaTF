package com.matricula.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="matriculas")

public class Matricula {
	@Id
	@Column(name = "matricula_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@ManyToOne
	@JoinColumn(name = "student_id", nullable = false)
	private Student student;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "ncursos")
	private Integer ncursos;
	
	@ManyToOne
	@JoinColumn(name = "enrollment_id", nullable = false)
	private Enrollment enrollment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getNcursos() {
		return ncursos;
	}

	public void setNcursos(Integer ncursos) {
		this.ncursos = ncursos;
	}

	public Enrollment getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Enrollment enrollment) {
		this.enrollment = enrollment;
	}
	
	@Override
	public String toString() {
		return "Matricula [id=" + id + ", student=" + student + ", estado=" + estado + ", enrollment=" + enrollment
				+ "]";
	}
}
