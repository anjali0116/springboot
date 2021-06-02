package com.hcl.employeedetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.employeedetails.exception.InsertionException;
import com.hcl.employeedetails.model.Employee;
import com.hcl.employeedetails.service.EmployeeServiceImpl;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeServiceImpl service;
	@GetMapping("/api/employees")
	public ResponseEntity<List<Employee>> getEmployee(){
		return new ResponseEntity<List<Employee>>(service.displayEmployee(),HttpStatus.OK);
	}
	@PostMapping("/api/employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) throws InsertionException{
		System.out.println(emp);
	return new ResponseEntity<Employee>(service.addEmployee(emp),HttpStatus.CREATED);
	}
	@GetMapping("/api/employees/{id}")
	public ResponseEntity<Employee> searchDetails(@PathVariable int id) throws InsertionException{
		return new ResponseEntity<Employee>(service.searchDetails(id),HttpStatus.CREATED);
	}
	@PutMapping("/api/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody Employee emp) throws InsertionException{
		return new ResponseEntity<Employee>(service.updateEmployee(id,emp),HttpStatus.CREATED);
	}
	@DeleteMapping("/api/employees/{id}")
	public ResponseEntity<Boolean> deleteEmployee(@PathVariable int id) throws InsertionException{
		return new ResponseEntity<Boolean>(service.deleteEmployee(id),HttpStatus.CREATED);
		}
}
