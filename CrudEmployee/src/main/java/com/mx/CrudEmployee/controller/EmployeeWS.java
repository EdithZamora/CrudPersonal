package com.mx.CrudEmployee.controller;

import java.time.LocalDate;
import java.time.Period;
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

import com.mx.CrudEmployee.model.Employees;
import com.mx.CrudEmployee.servicio.EmployeeServImp;





@RestController
@RequestMapping("EmployeeWS")
@CrossOrigin
public class EmployeeWS {

	// inyeccion de dependencias
	@Autowired
	EmployeeServImp employeeServImp;

	// http://localhost:8005/EmployeeWS/listar
	// respuesa del lado del servidor
	// listar
	@GetMapping("listar")
	public List<Employees> listar() {
		List<Employees> listaEmployee = employeeServImp.listar();
		return listaEmployee;
	}

	// guardar

	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Employees employees) {

		List<Employees> lista = employeeServImp.listar();
		for (var listaEm : lista) {

			LocalDate ahora = LocalDate.now();
			LocalDate birthdate = employees.getBirthdate();
			int edad = Period.between(birthdate, ahora).getYears();

			if (edad < 18) {
				return ResponseEntity.badRequest().body("el empleado debe ser mayor de edad");
			}

			if (listaEm.getName().equals(employees.getName())
					&& listaEm.getLast_name().equals(employees.getLast_name())) {

				return new ResponseEntity<String>("error datos duplicados", HttpStatus.BAD_REQUEST);

			}

			if (listaEm.getGenders().getId() != (employees.getGenders().getId())
					|| listaEm.getJobs().getId() != (employees.getJobs().getId())) {
				return new ResponseEntity<String>("error datos no estan en bd de jobs o genders",
						HttpStatus.BAD_REQUEST);
			}

		}
		employeeServImp.guardar(employees);
		return new ResponseEntity<String>("se guardo el empleado", HttpStatus.OK);

	}

	// editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Employees employees) {
		employeeServImp.editar(employees);
		return new ResponseEntity<String>("se edito el empleado", HttpStatus.OK);
	}

	// eliminar
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Employees employees) {
		employeeServImp.eliminar(employees);
		return new ResponseEntity<String>("se elimino el estado", HttpStatus.OK);
	}
	
	// buscar
		@PostMapping("buscar")
		public Employees buscar(@RequestBody Employees employees) {

			return employeeServImp.buscar(employees);
		}

}
