package com.hcl.employeedetails.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Service
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="a_first_name")
	private String a_first_name;
	@Column(name="b_last_name")
	private String b_last_name;
	@Column(name="c_email")
	private String c_email;
	@Column(name="d_department")
	private String d_department;

}
