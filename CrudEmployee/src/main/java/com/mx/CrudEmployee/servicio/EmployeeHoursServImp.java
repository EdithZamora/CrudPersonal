package com.mx.CrudEmployee.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mx.CrudEmployee.dao.EmployeeHousDao;
import com.mx.CrudEmployee.model.EmployeeHours;


@Service
public class EmployeeHoursServImp implements EmployeeHoursServ{
	
	@Autowired
	EmployeeHousDao employeeHousDao;

	@Override
	public void guardar(EmployeeHours employeeHours) {
		// TODO Auto-generated method stub
		employeeHousDao.save(employeeHours);
		
	}

	@Override
	public void editar(EmployeeHours employeeHours) {
		// TODO Auto-generated method stub
		employeeHousDao.save(employeeHours);
	}

	@Override
	public void eliminar(EmployeeHours employeeHours) {
		// TODO Auto-generated method stub
		employeeHousDao.delete(employeeHours);
	}

	@Override
	public EmployeeHours buscar(EmployeeHours employeeHours) {
		// TODO Auto-generated method stub
		return employeeHousDao.findById(employeeHours.getId()).orElse(null);
	}

	@Override
	public List<EmployeeHours> listar() {
		// TODO Auto-generated method stub
		return (List<EmployeeHours>) employeeHousDao.findAll();
	}

}
