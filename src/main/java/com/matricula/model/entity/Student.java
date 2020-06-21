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
@Table(name="students")

public class Student {
	
	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;

	@Column(name = "name")
	//@NotEmpty(message="Ingrese nombre")
	private String name;
	
	@Column(name = "lastname")
	//@NotEmpty(message="Ingrese apellido")
	private String lastName;
	
	@Column(name = "career")
	//@NotEmpty(message="Ingrese carrera")
	private String career;
	
	@Column(name = "semester")
	//@NotEmpty(message="Ingrese en que ciclo se encuentra")
	private Integer semester;
	
	@Column(name = "correo")
	//@NotEmpty(message="Ingrese su email")
	private String correo;
	
	@Column(name = "modalidad")
	//@NotEmpty(message="Ingrese el tipo de modalidad")
	private String modalidad;
	
	@Column(name = "estado")
	//@NotEmpty(message="Ingrese el estado actual del alumno")
	private String estado;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

	
}
