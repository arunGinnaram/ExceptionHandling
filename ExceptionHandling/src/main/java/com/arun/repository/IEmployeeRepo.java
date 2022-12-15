package com.arun.repository;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arun.entity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Serializable> {

	@Query("SELECT e FROM Employee e WHERE e.empid=:id")
	public Employee fingEmpById(@Param("id") Integer id);

}
