package com.example.springCrudApp.Business;

import java.util.List;

import com.example.springCrudApp.Entities.Employee;

public interface IEmployeeService {
	
	List<Employee> getAll();
	void add(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	
	Employee getById(int id);
	

}
