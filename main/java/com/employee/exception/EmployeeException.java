package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@Component
public class EmployeeException extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value=EmployeeNotFoundException.class)
	public ResponseEntity handleEmployeeAlreadyExistException(EmployeeNotFoundException empt)
	
	{
		return  new ResponseEntity("Employee Not found in dataBase",HttpStatus.CONFLICT);
		
	}

}
