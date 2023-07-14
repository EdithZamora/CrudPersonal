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

import com.mx.CrudEmployee.model.Jobs;
import com.mx.CrudEmployee.servicio.JobsServImp;


@RestController
@RequestMapping("JobsWs")
@CrossOrigin
public class JobsWs {
	
	@Autowired
	JobsServImp jobsServImp;
	// http://localhost:8005/JobsWs/listar
	// listar
		@GetMapping("listar")
		public List<Jobs> listar() {
			List<Jobs> listajob = jobsServImp.listar();
			return listajob;
		}
		
		// guardar
		@PostMapping("guardar")
		public ResponseEntity<String> guardar(@RequestBody Jobs jobs) {
			jobsServImp.guardar(jobs);
			return new ResponseEntity<String>("se guardo el estado", HttpStatus.OK);
		}

		// editar
			@PostMapping("editar")
			public ResponseEntity<String> editar(@RequestBody Jobs jobs) {
				jobsServImp.editar(jobs);
				return new ResponseEntity<String>("se edito el estado", HttpStatus.OK);
			}
		// eliminar
		@PostMapping("eliminar")
		public ResponseEntity<String> eliminar(@RequestBody Jobs jobs) {
			jobsServImp.eliminar(jobs);
			return new ResponseEntity<String>("se elimino el estado", HttpStatus.OK);
		}

		// buscar
		@PostMapping("buscar")
		public Jobs buscar(@RequestBody Jobs jobs) {

			return jobsServImp.buscar(jobs);
		}
		


}
