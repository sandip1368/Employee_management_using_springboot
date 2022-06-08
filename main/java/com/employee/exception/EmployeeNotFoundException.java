package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

public class EmployeeNotFoundException extends RuntimeException{
	
	private static final long serialVersionUid=1L;
	String msg;
	public EmployeeNotFoundException(String msg, HttpStatus notFound) {
		super(msg);
		this.msg=msg;	
		
	}

}
