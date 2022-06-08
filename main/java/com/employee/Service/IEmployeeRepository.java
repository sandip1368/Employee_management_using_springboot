package com.employee.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Entity.EmployeeEntity;

public interface IEmployeeRepository extends JpaRepository<EmployeeEntity,Integer>
{
	

}
