package com.example.springCrudApp.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.springCrudApp.Entities.Employee;

@Repository
public class HEmployeeDal implements IEmployeeDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HEmployeeDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Employee> getAll() {
		Session session =  entityManager.unwrap(Session.class);
		List<Employee> employee = session.createQuery("from demo.employee" , Employee.class).getResultList();
		return employee;
	}

	@Override
	public void add(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
		
	}

	@Override
	public void update(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
		
	}

	@Override
	public void delete(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(employee);
		
	}

	@Override
	public Employee getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		Employee employee = session.get(Employee.class, id);
		
		return employee;
	}	
}
