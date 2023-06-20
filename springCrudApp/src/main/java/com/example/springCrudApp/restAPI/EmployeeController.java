package com.example.springCrudApp.restAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springCrudApp.Entities.*;
import com.example.springCrudApp.Business.IEmployeeService;

@RestController
@RequestMapping("api")
public class EmployeeController {
	private IEmployeeService employeeService;
	
	@Autowired
	public EmployeeController(IEmployeeService employeService) 
	{
		this.employeeService = employeService;
	}
	
	@GetMapping("employees")
	public List<Employee> get(){
		return employeeService.getAll();
	}
	
	@PostMapping("/addEmployee")
	public void add(@RequestBody Employee employee) {
		this.employeeService.add(employee);
	}
	
	@PostMapping("/updateEmployee")
	public void update(@RequestBody Employee employee) {
		this.employeeService.update(employee);
	}
	
	@PostMapping("/deleteEmployee")
	public void delete(@RequestBody Employee Employee) {
		this.employeeService.delete(Employee);
	}
	
	@GetMapping("/employees/{id]")
	public Employee getById(@PathVariable int id) {
		return employeeService.getById(id);
	}
}
