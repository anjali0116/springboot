package com.hcl.employeedetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.employeedetails.model.Employee;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer>{

}
