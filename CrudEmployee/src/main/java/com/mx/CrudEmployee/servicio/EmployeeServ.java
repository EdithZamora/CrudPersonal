package com.mx.CrudEmployee.servicio;

import java.util.List;

import com.mx.CrudEmployee.model.Employees;

public interface EmployeeServ {
	public void guardar(Employees employees);

	public void editar(Employees employees);

	public void eliminar(Employees employees);

	public Employees buscar(Employees employees);

	public List<Employees> listar();

}
