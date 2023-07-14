package com.mx.CrudEmployee.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudEmployee.model.Jobs;

public interface JobsDao extends CrudRepository<Jobs, Integer>{

}
