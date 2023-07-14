package com.mx.CrudEmployee.model;



import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;




@Entity
@Table(name="EMPLOYEES")
public class Employees {
	
	
	@Id
	int id;
	
	@NotEmpty(message = "El campo de deber ser vacio nombre")
	String name;
	@NotEmpty(message = "El campo de deber ser vacio las name")
	String last_name;

	
	
	LocalDate birthdate;
	


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="GENDER_ID")
	Genders genders;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="JOB_ID")
	Jobs jobs;
	
	

	public Employees() {
		super();
	}

	public Employees(int id) {
		super();
		this.id = id;
	}

	public Employees(int id, String name, String last_name, LocalDate birthdate, Genders genders, Jobs jobs) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.birthdate = birthdate;
		this.genders = genders;
		this.jobs = jobs;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", last_name=" + last_name + ", birthdate=" + birthdate
				+ ", genders=" + genders + ", jobs=" + jobs + "]/n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Genders getGenders() {
		return genders;
	}

	public void setGenders(Genders genders) {
		this.genders = genders;
	}

	public Jobs getJobs() {
		return jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}
	
	
	
	

}
