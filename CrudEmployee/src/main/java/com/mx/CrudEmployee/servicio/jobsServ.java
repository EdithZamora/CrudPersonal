package com.mx.CrudEmployee.servicio;

import java.util.List;


import com.mx.CrudEmployee.model.Jobs;

public interface jobsServ {

	public void guardar(Jobs job);

	public void editar(Jobs job);

	public void eliminar(Jobs job);

	public Jobs buscar(Jobs job);

	public List<Jobs> listar();

}
