package com.arun.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arun.entity.Employee;
import com.arun.repository.IEmployeeRepo;


@Service
//@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo iEmpRepo;
	
	@Override
	public boolean saveEmployee(Employee emp) {
		Employee save = iEmpRepo.save(emp);
		if(save!=null)
		return true;
		else
		return false;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> findAll = iEmpRepo.findAll();		 
		return findAll;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Employee fingEmpById = iEmpRepo.fingEmpById(id);
		return fingEmpById;
	}
}
