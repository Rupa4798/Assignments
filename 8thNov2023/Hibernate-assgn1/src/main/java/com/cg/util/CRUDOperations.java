package com.cg.util;
import com.cg.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CRUDOperations {
	public void insertEntity() {
		EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		Account acc=new Account(105,"Rupa",5789.07f);
		Account a2=new Account(104,"sri",57890.7f);
		entitymanager.persist(acc);
		entitymanager.persist(a2);
		entitytransaction.commit();
		entitymanager.close();
	}
	public void findEntity() {
		EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entitymanager.getTransaction().begin();
		Account empobj=entitymanager.find(Account.class,101);
		System.out.println(empobj);
		entitymanager.getTransaction().commit();
		entitymanager.close();
	}
	public void updateEntity() {
		
		EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		Account empobj=entitymanager.find(Account.class,101);
		System.out.println(empobj);
		empobj.setName("john");
		empobj.setBalance(5678.78f);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		
		
	}
	public void removeEntity() {
	    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	    entityManager.getTransaction().begin();
	    Account empObj = entityManager.find(Account.class, 101);
	    //System.out.println(empObj);
	    entityManager.remove(empObj);
	    entityManager.getTransaction().commit();
	    entityManager.close();
	}


}
