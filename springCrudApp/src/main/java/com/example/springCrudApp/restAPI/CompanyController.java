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
import com.example.springCrudApp.Business.ICompanyService;

@RestController
@RequestMapping("api")
public class CompanyController {
	private ICompanyService companyService;
	
	@Autowired
	public CompanyController(ICompanyService companyService) 
	{
		this.companyService = companyService;
	}
	
	@GetMapping("/companies")
	public List<Company> get(){
		return companyService.getAll();
	}
	
	@PostMapping("/addCompany")
	public void add(@RequestBody Company compnay) {
		this.companyService.add(compnay);
	}
	
	@PostMapping("/updateCompany")
	public void update(@RequestBody Company company) {
		this.companyService.update(company);
	}
	
	@PostMapping("/deleteCompany")
	public void delete(@RequestBody Company company) {
		this.companyService.delete(company);	
	}
	
	@GetMapping("/companies/{id}")
	public Company getById(@PathVariable int id) {
		return companyService.getById(id);
	}
}
