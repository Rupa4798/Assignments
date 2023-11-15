package com.cg;

import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;

public class TestAccount {

	public static void main(String[] args) {

		EntityManager e=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		Credit c= new Credit();
		c.setName("rupa");
		c.setOverduelimit(6789.98f);
		
		Debit d=new Debit();
		d.setName("Rupasri");
		d.setInterest(567789.6f);
		
		e.getTransaction().begin();
		e.persist(c);
		e.persist(d);
		e.getTransaction().commit();
		e.close();
		
	}

}
