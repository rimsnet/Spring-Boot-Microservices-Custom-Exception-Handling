package com.rimsan.springboot.exception.handling.service;

import com.rimsan.springboot.exception.handling.entities.Employee;
import com.rimsan.springboot.exception.handling.error.CustomException;

public interface EmployeeService {
	
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployeeById(long id)throws CustomException;
	
	

}
