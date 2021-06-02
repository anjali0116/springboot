package com.hcl.employeedetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EmployeeSpringBoot1Application extends SpringBootServletInitializer{
@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(EmployeeSpringBoot1Application.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringBoot1Application.class, args);
	}

}
