package com.mx.CrudEmployee.servicio;

import java.util.List;

import com.mx.CrudEmployee.model.EmployeeHours;


public interface EmployeeHoursServ {
	public void guardar(EmployeeHours employeeHours);

	public void editar(EmployeeHours employeeHours);

	public void eliminar(EmployeeHours employeeHours);

	public EmployeeHours buscar(EmployeeHours employeeHours);

	public List<EmployeeHours> listar();

}
