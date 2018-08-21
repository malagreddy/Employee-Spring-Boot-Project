package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.pojo.Employee;
import com.employee.service.employeeServiceInterface;

import java.util.Arrays;

@RestController
public class employeeController {

	@Autowired
	private employeeServiceInterface service;

	@RequestMapping("/employee")
	public List<Employee> getallEmployees() {
		return service.getAllEmployees();
	}

	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return service.getEmployee(id);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee emp) {
		service.addEmployee(emp);
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee emp, @PathVariable String id) {
		service.updateEmployee(emp, id);
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String id) {
		service.deleteEmployee(id);
	}
	
	
}
