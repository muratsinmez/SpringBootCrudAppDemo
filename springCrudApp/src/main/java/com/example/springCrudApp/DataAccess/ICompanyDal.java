package com.example.springCrudApp.DataAccess;

import java.util.List;

import com.example.springCrudApp.Entities.*;

public interface ICompanyDal {
	
	List<Company> getAll();
	void add(Company company);
	void update(Company company);
	void delete(Company company);
	Company getById(int id);
	

}
