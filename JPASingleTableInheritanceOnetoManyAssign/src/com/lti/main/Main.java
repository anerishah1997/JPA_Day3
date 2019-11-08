package com.lti.main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Account;
import com.lti.model.Savings;
import com.lti.model.Transaction;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		Account account = new Savings(10020, "Aneri", 450000, 7.0);
		Transaction t1 = new Transaction(12, 2000);
		Transaction t2 = new Transaction(14, 4000);
		Transaction t3 = new Transaction(16, 6000);
		
		Set<Transaction> trans = new HashSet<>();
		trans.add(t1);
		trans.add(t2);
		trans.add(t3);
		
		account.setTransactions(trans);
		
		t1.setAccount(account);
		t2.setAccount(account);
		t3.setAccount(account);
		
		entityManager.getTransaction().begin();
		entityManager.persist(account);
		entityManager.getTransaction().commit();
		
		
		
	}

}
