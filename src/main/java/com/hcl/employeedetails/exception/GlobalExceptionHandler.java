package com.hcl.employeedetails.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleRuntimeException(HttpServletRequest request, Exception ex){
		System.out.println("Global exception handler");
		System.out.println("RuntimeException occured:: URL="+request.getRequestURI() +" raised "+ex);
		return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
