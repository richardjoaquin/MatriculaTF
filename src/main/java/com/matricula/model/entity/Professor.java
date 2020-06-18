package com.matricula.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity 
@Table(name="professors")
public class Professor {

	@Id
	@Column(name = "professor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "name")
	//@NotEmpty(message="Ingrese nombre")
	private String name;
	
	@Column(name = "last_name")
	//@NotEmpty(message="Ingrese apellido")
	private String lastName;

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public void setName(String name) {
	this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	
}
