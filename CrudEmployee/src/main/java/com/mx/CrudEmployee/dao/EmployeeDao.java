package com.mx.CrudEmployee.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudEmployee.model.Employees;

public interface EmployeeDao extends CrudRepository<Employees, Integer>{

}
