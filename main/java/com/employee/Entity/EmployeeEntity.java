package com.employee.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeEntity implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	String name;
	String emp_designation;
	Integer emp_age;
	String emp_email;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(Integer id,String name,String emp_designation, Integer emp_age, String emp_email, Gender gender) {
		super();
		this.id = id;
		this.name=name;
		this.emp_designation = emp_designation;
		this.emp_age = emp_age;
		this.emp_email = emp_email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", emp_designation=" + emp_designation + ", emp_age="
				+ emp_age + ", emp_email=" + emp_email + ", emp_gender=" + gender + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public String getEmp_designation() {
		return emp_designation;
	}
	public Integer getEmp_age() {
		return emp_age;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public Gender getGender() {
		return gender;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}
	public void setEmp_age(Integer emp_age) {
		this.emp_age = emp_age;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
}	
	
		enum Gender{
			
			male,female
	}
	

