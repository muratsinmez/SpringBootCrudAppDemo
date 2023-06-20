package com.example.springCrudApp.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springCrudApp.DataAccess.IEmployeeDal;
import com.example.springCrudApp.Entities.Employee;

@Service
public class EmployeeManager implements IEmployeeService {
	
	private IEmployeeDal employeeDal;
	
	
	@Autowired
	public EmployeeManager(IEmployeeDal employeeDal) {
		this.employeeDal = employeeDal;
	}

	@Override
	@Transactional
	public List<Employee> getAll() {
		return this.employeeDal.getAll();
	}

	@Override
	@Transactional
	public void add(Employee employee) {
		this.employeeDal.add(employee);
		
	}

	@Override
	@Transactional
	public void update(Employee employee) {
		this.employeeDal.update(employee);
		
	}

	@Override
	@Transactional
	public void delete(Employee employee) {
		this.employeeDal.delete(employee);
		
	}

	@Override
	public Employee getById(int id) {
		
		return this.employeeDal.getById(id);
	}

}
