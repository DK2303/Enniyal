package com.main.enniyal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.enniyal.dto.EmployeeDTO;
import com.main.enniyal.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add")
	public void addEmployee(@RequestBody EmployeeDTO employeeDTO) {
		employeeService.addClient(employeeDTO);
	}
	
	@GetMapping("/get")
	public void getEmployee(@RequestBody EmployeeDTO employeeDTO) {
		employeeService.addClient(employeeDTO);
	}
	
	@PutMapping("/put")
	public void updteEmployee(@RequestBody EmployeeDTO employeeDTO) {
		employeeService.addClient(employeeDTO);
	}
	
	@DeleteMapping("/delete")
	public void deleteEmployee(@RequestBody EmployeeDTO employeeDTO) {
		employeeService.addClient(employeeDTO);
	}

}
