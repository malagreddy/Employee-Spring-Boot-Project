package com.employee.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.employee.pojo.Employee;

@Repository
public class employeeDaoImpl implements employeeDaoInterface {

	private List<Employee> employee = new ArrayList<>(Arrays.asList(
			new Employee("101", "Mala", 10000),
			new Employee("102", "Prema", 20000),
			new Employee("103", "suma", 13000),
			new Employee("104", "My3", 9000)));

	public List<Employee> getAllEmployees() {
		return employee;
	}

	
	public Employee getEmployee(final String id) {
		return employee.stream().filter(emp -> emp.getEmpId().equals(id)).findFirst().get();
	}

	public void addEmployee(Employee emp) {
		employee.add(emp);
	}

	
	public void updateEmployee(Employee emp, String id) {
		for (int i = 0; i < employee.size(); i++) {
			Employee empl = employee.get(i);
			if (empl.getEmpId().equals(id)) {
				employee.set(i, emp);
				return;
			}
		}

	}

	
	public void deleteEmployee(String id) {
		employee.removeIf(emp -> emp.getEmpId().equals(id));
		
	}

}
