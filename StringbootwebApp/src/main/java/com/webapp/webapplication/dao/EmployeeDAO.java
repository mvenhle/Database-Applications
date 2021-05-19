package com.webapp.webapplication.dao;

import java.util.List;

import com.webapp.webapplication.model.Employee;

public interface EmployeeDAO {
	List<Employee> get ();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
}
