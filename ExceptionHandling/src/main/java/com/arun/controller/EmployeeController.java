package com.arun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arun.entity.Employee;
import com.arun.helper.ResponseAPI;
import com.arun.service.IEmployeeService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService iEmpServ; 
	
	@ApiOperation("To save the Employee Data")
	@ApiResponses({
		@ApiResponse(code = 200, message = "Employee Saved"),
		@ApiResponse(code = 500, message = "Internal Server Error"),
		@ApiResponse(code = 404, message = "Unable to Save Employee") })
	@RequestMapping(value="/saveEmployee",method = RequestMethod.POST)
	public ResponseEntity<ResponseAPI> saveEmp(@RequestBody Employee emp){
		boolean saveEmployee = iEmpServ.saveEmployee(emp);
		if(saveEmployee==true) {
			return new ResponseEntity<>(new ResponseAPI("success", "Employee Saved", saveEmployee),
					HttpStatus.OK);  
		}
		else {  
			return new ResponseEntity<>(new ResponseAPI("Failed","Employee not Saved",saveEmployee),HttpStatus.INTERNAL_SERVER_ERROR);
		} 
	}

}
