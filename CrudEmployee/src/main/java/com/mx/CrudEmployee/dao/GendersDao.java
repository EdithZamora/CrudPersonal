package com.mx.CrudEmployee.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudEmployee.model.Genders;

public interface GendersDao extends CrudRepository<Genders, Integer>{

}
