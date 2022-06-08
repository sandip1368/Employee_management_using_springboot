package com.employee.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Entity.EmployeeEntity;
import com.employee.Service.IEmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService emplService;
	@RequestMapping("/")
	public String getMassage()
	{
		return "helloWorld";
	}
	
	//Add Employee data in database
	@PostMapping("/employee")
	public ResponseEntity<EmployeeEntity>  CreateEmployee(@RequestBody EmployeeEntity employee)
	{
		System.out.println("start in post");
		EmployeeEntity employeeEntity=emplService.saveEmployee(employee);
		
		return new ResponseEntity<EmployeeEntity>(employeeEntity,HttpStatus.CREATED);
	}
	
	
	// All Fetch data from database
	@GetMapping("/allemployees")
	public List<EmployeeEntity> getAllEmployeeDetails()
	{
		return emplService.gellAllEmployee();
	}
	
	
	//only faech data depends on id
	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeEntity> getBYIdEmployeeDetails(@PathVariable("id") Integer id)
	{
	 EmployeeEntity ent=emplService.gellByIdEmployee(id);
	 
	 return new ResponseEntity<EmployeeEntity>(ent,HttpStatus.OK);
	}
	
	
	// Update Employeee details 
	@PutMapping("/employee/{id}")
	public ResponseEntity<EmployeeEntity> updateStudentData(@RequestBody EmployeeEntity employee, @PathVariable("id") Integer id)
	{
		System.out.println("start contr ser");
		EmployeeEntity rst=emplService.updateEmployeeData(employee, id);
		
	return new ResponseEntity<EmployeeEntity>(rst,HttpStatus.OK);
	
//		try {
//
//			emplService.updateEmployeeData(employee, id);
//		} catch (Exception e) {
//			e.printStackTrace();
//			rst = new ResponseEntity<EmployeeEntity>(HttpStatus.NOT_FOUND);
//		}
//
//		return rst;
	
	}
	
	
	
	
	//Delete Employee 
	@DeleteMapping("/employee/{Id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("Id") Integer Id)
	{
		emplService.deleteEmployeeById(Id);
		return ResponseEntity.ok().body("Employee delete succesfully");
	
		
		
		
//		ResponseEntity<EmployeeEntity> resp=new ResponseEntity<>(HttpStatus.OK);		
//		try {
//			
//			emplService.deleteEmployeeById(Id);
//	}
//		catch(Exception e) {
//			e.printStackTrace();
//			resp=new ResponseEntity<EmployeeEntity>(HttpStatus.NOT_FOUND);
//		}
//		
//		return resp;
//	
//	}	
	
}
}

