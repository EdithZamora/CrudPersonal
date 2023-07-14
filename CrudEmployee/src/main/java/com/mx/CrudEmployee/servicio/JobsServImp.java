package com.mx.CrudEmployee.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmployee.dao.JobsDao;
import com.mx.CrudEmployee.model.Employees;
import com.mx.CrudEmployee.model.Jobs;

@Service
public class JobsServImp implements jobsServ{
	
	
	@Autowired
	JobsDao jobsDao;

	@Override
	public void guardar(Jobs job) {
		// TODO Auto-generated method stub
		jobsDao.save(job);

		
	}

	@Override
	public void editar(Jobs job) {
		// TODO Auto-generated method stub
		jobsDao.save(job);
		
	}

	@Override
	public void eliminar(Jobs job) {
		// TODO Auto-generated method stub
		jobsDao.delete(job);
		
	}

	@Override
	public Jobs buscar(Jobs job) {
		// TODO Auto-generated method stub
		return jobsDao.findById(job.getId()).orElse(null);
	}

	@Override
	public List<Jobs> listar() {
		// TODO Auto-generated method stub
		return (List<Jobs>) jobsDao.findAll();
	}

}
