package com.mx.CrudEmployee.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmployee.dao.GendersDao;
import com.mx.CrudEmployee.model.Genders;
import com.mx.CrudEmployee.model.Jobs;

@Service
public class GendersServImp implements GendersServ{
	
	@Autowired
	GendersDao gendersDao;

	@Override
	public void guardar(Genders genders) {
		// TODO Auto-generated method stub
		gendersDao.save(genders);
		
	}

	@Override
	public void editar(Genders genders) {
		// TODO Auto-generated method stub
		gendersDao.save(genders);
		
	}

	@Override
	public void eliminar(Genders genders) {
		// TODO Auto-generated method stub
		gendersDao.delete(genders);
	}

	@Override
	public Genders buscar(Genders genders) {
		// TODO Auto-generated method stub
		return gendersDao.findById(genders.getId()).orElse(null);
	}

	@Override
	public List<Genders> listar() {
		// TODO Auto-generated method stub
		return (List<Genders>) gendersDao.findAll();
	}

}
