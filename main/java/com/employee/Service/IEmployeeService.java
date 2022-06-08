package com.employee.Service;

import java.util.List;
import java.util.Optional;

import com.employee.Entity.EmployeeEntity;

public interface IEmployeeService {

	EmployeeEntity saveEmployee(EmployeeEntity employee);

	List<EmployeeEntity> gellAllEmployee();

	EmployeeEntity gellByIdEmployee(Integer id);

	EmployeeEntity updateEmployeeData(EmployeeEntity employee, Integer id);

	void deleteEmployeeById(Integer id);;
}
