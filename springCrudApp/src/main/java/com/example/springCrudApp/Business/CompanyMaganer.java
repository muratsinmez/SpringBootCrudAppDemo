package com.example.springCrudApp.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springCrudApp.DataAccess.ICompanyDal;
import com.example.springCrudApp.Entities.Company;

@Service
public class CompanyMaganer implements ICompanyService {
	
	private ICompanyDal companyDal;
	
	@Autowired
	public CompanyMaganer(ICompanyDal companyDal) 
	{
		this.companyDal = companyDal;
	}

	@Override
	@Transactional
	public List<Company> getAll() {
		
		return this.companyDal.getAll();
	}

	@Override
	@Transactional
	public void add(Company company) {
		// koşulda eklenebilir.
		this.companyDal.add(company);
		
	}

	@Override
	@Transactional
	public void update(Company company) {
		this.companyDal.update(company);
		
	}

	@Override
	@Transactional
	public void delete(Company company) {
		this.companyDal.delete(company);
		
	}

	@Override
	public Company getById(int id) {
		
		return this.companyDal.getById(id);
	}
	
}
