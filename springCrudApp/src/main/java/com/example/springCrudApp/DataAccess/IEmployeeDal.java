package com.example.springCrudApp.DataAccess;

import java.util.List;

import com.example.springCrudApp.Entities.*;

public interface IEmployeeDal {
	
	List<Employee> getAll();
	void add(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	Employee getById(int id);

}
