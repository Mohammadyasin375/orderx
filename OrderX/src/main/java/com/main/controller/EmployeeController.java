/**
 * 
 */
package com.main.controller;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.dto.EmployeeDto;
import com.main.entity.Employee;
import com.main.service.EmployeeService;

/**
 * 
 */
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * This method is just for testing purpose.
	 * @return
	 */
	@GetMapping("/get-all")
	public List<EmployeeDto> getAllEmployees(){
		List<Employee> employeeList = employeeService.getAllEmployees();
		List<EmployeeDto> employeeDtoList = new ArrayList<EmployeeDto>();
		
		for(Employee employee: employeeList) {
			EmployeeDto employeeDto = new EmployeeDto();
			employeeDto.setEmployeeId(employee.getEmployeeId());
			employeeDto.setFistName(employee.getFistName());
			employeeDto.setLastName(employee.getLastName());
			employeeDto.setJobTitle(employee.getJobTitle());
			employeeDtoList.add(employeeDto);
		}
		return employeeDtoList;
	}
	
}
