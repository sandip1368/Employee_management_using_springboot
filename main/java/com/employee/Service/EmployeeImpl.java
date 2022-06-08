package com.employee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.employee.Entity.EmployeeEntity;
import com.employee.exception.EmployeeNotFoundException;

@Service
public class EmployeeImpl implements IEmployeeService{

	@Autowired
	IEmployeeRepository employeeRepository;

	
	//save data 
	public EmployeeEntity saveEmployee(EmployeeEntity employee) {

		return employeeRepository.save(employee);
		
	}

	
	
	
	//get All data 
	public List<EmployeeEntity> gellAllEmployee() {

		return employeeRepository.findAll();
	}

	
	
	//get Data based on Id 
	@Override
	public EmployeeEntity gellByIdEmployee(Integer id) {
		// TODO Auto-generated method stub
		
	Optional<EmployeeEntity> emp_ent= employeeRepository.findById(id);
	if(emp_ent.isPresent())
	{
		return emp_ent.get();
		
	}
	else {
	      throw new EmployeeNotFoundException("Employeee data Not present in database"+id,HttpStatus.NOT_FOUND);
	}

	}

	
	
	//update data 
	@Override
	public EmployeeEntity updateEmployeeData(EmployeeEntity employee, Integer id) {
		
		
			
		     System.out.println("service start");
				EmployeeEntity emp=employeeRepository.findById(id)
				.orElseThrow( () -> new EmployeeNotFoundException("Employeee id not present in database"+id,HttpStatus.NOT_FOUND));
				
				emp.setEmp_age(employee.getEmp_age());
				emp.setEmp_designation(employee.getEmp_designation());
				emp.setEmp_email(employee.getEmp_email());
				emp.setEmp_email(employee.getEmp_email());
				emp.setGender(employee.getGender());
				
				return employeeRepository.save(emp);
			}

	
	
	//delete data 
	@Override
	public void deleteEmployeeById(Integer id) {
		
		employeeRepository.deleteById(id);
	}
	
	}
	
	


