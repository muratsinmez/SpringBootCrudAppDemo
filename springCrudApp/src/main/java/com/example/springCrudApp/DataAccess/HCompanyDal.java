package com.example.springCrudApp.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springCrudApp.Entities.Company;

@Repository
public class HCompanyDal implements ICompanyDal{
	
	private EntityManager entityManager;
	
	
	@Autowired
	public HCompanyDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
		
	}
	

	@Override
	public List<Company> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Company> company = session.createQuery("from demo.company", Company.class).getResultList();
		return company;
	}

	@Override
	public void add(Company company) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(company);
	}

	@Override
	public void update(Company company) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(company);
		
	}

	@Override
	public void delete(Company company) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(company);
		
	}


	@Override
	public Company getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		Company company = session.get(Company.class, id);
		
		return company;
	}

}
