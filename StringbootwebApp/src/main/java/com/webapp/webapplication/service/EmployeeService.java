package com.webapp.webapplication.service;

import java.util.List;

import com.webapp.webapplication.model.Employee;

public interface EmployeeService {
	List<Employee> get ();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);

}
