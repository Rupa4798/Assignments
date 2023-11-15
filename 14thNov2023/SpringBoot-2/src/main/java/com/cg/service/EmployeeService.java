package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;

	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		
		List<Employee> products= repo.findAll();
		System.out.println(products);
		return products;
		
		
	}

	public void save(Employee employee) {

		repo.save(employee);
		
		
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public Employee get(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
		
	
	}
	
}
