package com.mx.CrudEmployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudEmployee.model.Genders;

import com.mx.CrudEmployee.servicio.GendersServImp;

@RestController
@RequestMapping("GendersWS")
@CrossOrigin
public class GendersWS {

	@Autowired
	GendersServImp gendersServImp;

	// http://localhost:8005/GendersWS/listar
	// listar
	@GetMapping("listar")
	public List<Genders> listar() {
		List<Genders> listaGenders = gendersServImp.listar();
		return listaGenders;
	}

	// guardar
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Genders genders) {
		gendersServImp.guardar(genders);
		return new ResponseEntity<String>("se guardo el gender", HttpStatus.OK);
	}

	// editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Genders genders) {
		gendersServImp.editar(genders);
		return new ResponseEntity<String>("se edito el estado", HttpStatus.OK);
	}

	// eliminar
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Genders genders) {
		gendersServImp.eliminar(genders);
		return new ResponseEntity<String>("se elimino el estado", HttpStatus.OK);
	}

	// buscar
	@PostMapping("buscar")
	public Genders buscar(@RequestBody Genders genders) {

		return gendersServImp.buscar(genders);
	}

}
