package com.example.springCrudApp.Entities;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="idemployee")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idemployee;
	
	@Column(name="name_employee")
	private String name_employee;
	public Employee(int idemployee, String name_employee) {
		super();
		this.idemployee = idemployee;
		this.name_employee = name_employee;
	}
	
	public Employee() {}
	
	public int getIdemployee() {
		return idemployee;
	}
	public void setIdemployee(int idemployee) {
		this.idemployee = idemployee;
	}
	public String getName_employee() {
		return name_employee;
	}
	public void setName_employee(String name_employee) {
		this.name_employee = name_employee;
	}
	
}
