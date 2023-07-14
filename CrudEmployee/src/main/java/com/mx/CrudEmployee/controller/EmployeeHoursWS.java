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

import com.mx.CrudEmployee.model.EmployeeHours;

import com.mx.CrudEmployee.servicio.EmployeeHoursServImp;

@RestController
@RequestMapping("EmployeeHoursWS")
@CrossOrigin
public class EmployeeHoursWS {
	
	@Autowired
	EmployeeHoursServImp employeeHoursServImp;
	
	// http://localhost:8005/EmployeeHoursWS/listar
		// listar
		@GetMapping("listar")
		public List<EmployeeHours> listar() {
			List<EmployeeHours> listahoras = employeeHoursServImp.listar();
			return listahoras;
		}

		// guardar
		@PostMapping("guardar")
		public ResponseEntity<String> guardar(@RequestBody EmployeeHours employeeHours) {
			
			List<EmployeeHours> lista = employeeHoursServImp.listar();
			for (var listaHoras : lista) {
				if (listaHoras.getEmployees().getId() != (employeeHours.getEmployees().getId())){
					return new ResponseEntity<String>("error datos no estan en bd de Employees",HttpStatus.BAD_REQUEST);
				}
				
			}
			
			
			employeeHoursServImp.guardar(employeeHours);
			return new ResponseEntity<String>("se guardo el la hora", HttpStatus.OK);
		}

		// editar
		@PostMapping("editar")
		public ResponseEntity<String> editar(@RequestBody EmployeeHours employeeHours) {
			employeeHoursServImp.editar(employeeHours);
			return new ResponseEntity<String>("se edito la hora", HttpStatus.OK);
		}

		// eliminar
		@PostMapping("eliminar")
		public ResponseEntity<String> eliminar(@RequestBody EmployeeHours employeeHours) {
			employeeHoursServImp.eliminar(employeeHours);
			return new ResponseEntity<String>("se elimino la hora", HttpStatus.OK);
		}

		// buscar
		@PostMapping("buscar")
		public EmployeeHours buscar(@RequestBody EmployeeHours employeeHours) {

			return employeeHoursServImp.buscar(employeeHours);
		}


}
