package com.qa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import com.qa.model.Account;

public class AccountRepoDB implements AccountRepo {

	@PersistenceUnit(unitName = "myPU")
	private EntityManagerFactory emf;

	public Account createAccount(Account account) {
		System.out.println(1);
		EntityManager manager = emf.createEntityManager();
		System.out.println(2);
		EntityTransaction et = manager.getTransaction();
		System.out.println(3);
		et.begin();
		System.out.println(4);
		manager.persist(account);
		System.out.println(5);
		et.commit();
		System.out.println(6);
		manager.close();
		System.out.println(7);
		return account;
	}
}
