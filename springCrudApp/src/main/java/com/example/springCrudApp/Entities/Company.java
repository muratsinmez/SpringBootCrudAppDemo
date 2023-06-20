package com.example.springCrudApp.Entities;

import javax.persistence.*;

@Entity
@Table(name="company")
public class Company {
	
	@Id
	@Column(name="idcompany")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcompany;
	
	@Column(name="name_company")
	private String name_company;
	public Company(int idcompany, String name_company) {
		super();
		this.idcompany = idcompany;
		this.name_company = name_company;
	}
	
	public Company() {}
	
	public int getIdcompany() {
		return idcompany;
	}
	public void setIdcompany(int idcompany) {
		this.idcompany = idcompany;
	}
	public String getName_company() {
		return name_company;
	}
	public void setName_company(String name_company) {
		this.name_company = name_company;
	}
	
}
