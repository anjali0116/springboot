package com.hcl.employeedetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.employeedetails.dao.IEmployeeDAO;
import com.hcl.employeedetails.exception.InsertionException;
import com.hcl.employeedetails.model.Employee;
@Service
public class EmployeeServiceImpl {
@Autowired
	public IEmployeeDAO dao;
	public List<Employee> displayEmployee() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}

	public Employee searchDetails(int id)  throws InsertionException {
		// TODO Auto-generated method stub
		if(dao.findById(id).isPresent()) {
			return dao.findById(id).get();
		} else {
			throw new InsertionException("Id does not exists");
		}
		
	}

	public Employee updateEmployee(int id, Employee emp) throws InsertionException{
		// TODO Auto-generated method stub
		if(dao.findById(id).isPresent()) {
		return dao.saveAndFlush(emp);
	} else {
		throw new InsertionException("Id does not exists");
	}
	}

	public Boolean deleteEmployee(int id) throws InsertionException {
		// TODO Auto-generated method stub
		if(dao.findById(id).isPresent()) {
			dao.deleteById(id);
			return true;
		} else {
		throw new InsertionException("Id does not exists");
		}
	}
	
	}
