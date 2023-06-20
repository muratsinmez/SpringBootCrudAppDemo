package com.example.springCrudApp.Business;

import java.util.List;

import com.example.springCrudApp.Entities.Company;

public interface ICompanyService {
	
	List<Company> getAll();
	void add(Company company);
	void update(Company company);
	void delete(Company company);
	
	Company getById(int id);
	

}
