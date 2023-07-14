package com.mx.CrudEmployee.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "genders")
public class Genders {

	@Id
	int id;
	String name;

	// cardinalidad
	@OneToMany(mappedBy = "genders", cascade = CascadeType.ALL)
	List<Employees> lista = new ArrayList<Employees>();

	public Genders() {
		super();
	}

	public Genders(int id) {
		super();
		this.id = id;
	}

	public Genders(int id, String name, List<Employees> lista) {
		super();
		this.id = id;
		this.name = name;
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Genders [id=" + id + ", name=" + name + "]";
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
	
	
	

}
