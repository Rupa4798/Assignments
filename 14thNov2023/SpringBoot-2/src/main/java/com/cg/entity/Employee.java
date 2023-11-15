package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employ")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
		public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
		public Employee() {
		super();
	}
		public Employee(Long id, String company) {
		super();
		this.id = id;
		this.company = company;
	}
		String  company;
	
	
	
	

}
