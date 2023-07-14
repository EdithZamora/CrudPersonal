package com.mx.CrudEmployee.model;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;


@Entity
@Table(name="JOBS")
public class Jobs {
	
	@Id
	int id;
	String name;
	
	
	float salary;
	
	//cardinalidad
		@OneToMany(mappedBy="jobs",cascade = CascadeType.ALL)
		List<Employees> lista = new ArrayList<Employees>();

	public Jobs() {
		super();
	}

	public Jobs(int id) {
		super();
		this.id = id;
	}

	public Jobs(int id, String name, float salary, List<Employees> lista) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Jobs [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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

	public float getSalry() {
		return salary;
	}

	public void setSalry(float salry) {
		this.salary = salry;
	}
	
		
		
		
		
		
		

}
