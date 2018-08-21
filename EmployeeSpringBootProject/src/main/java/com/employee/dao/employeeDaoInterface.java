package com.employee.dao;

import java.util.List;

import com.employee.pojo.Employee;

public interface employeeDaoInterface {

	List<Employee> getAllEmployees();

	Employee getEmployee(String id);

	void addEmployee(Employee emp);

	void updateEmployee(Employee emp, String id);

	void deleteEmployee(String id);

}