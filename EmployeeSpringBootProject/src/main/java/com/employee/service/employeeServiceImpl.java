package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.employeeDaoInterface;
import com.employee.pojo.Employee;

@Service
public class employeeServiceImpl implements employeeServiceInterface {

	@Autowired
	private employeeDaoInterface dao ;

	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public Employee getEmployee(final String id) {
		return dao.getEmployee(id);

	}

	public void addEmployee(Employee emp) {
		dao.addEmployee(emp);
	}

	public void updateEmployee(Employee emp, String id) {
		dao.updateEmployee(emp, id);
	}

	public void deleteEmployee(String id) {
		dao.deleteEmployee(id);
	}

}
