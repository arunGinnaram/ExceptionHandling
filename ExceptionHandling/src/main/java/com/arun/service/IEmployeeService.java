package com.arun.service;

import java.util.List;

import com.arun.entity.Employee;

public interface IEmployeeService {
	public boolean saveEmployee(Employee emp) ;

	public List<Employee> getEmployees(); 
	 
	public Employee getEmployeeById(Integer id);
}
