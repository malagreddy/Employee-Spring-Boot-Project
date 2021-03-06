package com.employee.service;

import java.util.List;

import com.employee.pojo.Employee;

public interface employeeServiceInterface {

	List<Employee> getAllEmployees();

	Employee getEmployee(String id);

	void addEmployee(Employee emp);

	void updateEmployee(Employee emp, String id);

	void deleteEmployee(String id);

}