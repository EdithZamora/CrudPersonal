package com.mx.CrudEmployee.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudEmployee.dao.EmployeeDao;
import com.mx.CrudEmployee.model.Employees;



@Service
public class EmployeeServImp implements EmployeeServ {

	// inyeccion dependencias
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void guardar(Employees employees) {
		// TODO Auto-generated method stub
		employeeDao.save(employees);

	}

	@Override
	public void editar(Employees employees) {
		// TODO Auto-generated method stub
		employeeDao.save(employees);
	}

	@Override
	public void eliminar(Employees employees) {
		// TODO Auto-generated method stub
		employeeDao.delete(employees);
	}

	@Override
	public Employees buscar(Employees employees) {
		// TODO Auto-generated method stub
		return employeeDao.findById(employees.getId()).orElse(null);
	}

	@Override
	public List<Employees> listar() {
		// TODO Auto-generated method stub
		return (List<Employees>) employeeDao.findAll();
	}
	

}
