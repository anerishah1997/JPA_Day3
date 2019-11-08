package com.lti.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Current;
import com.lti.model.Savings;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		Savings s = new Savings(1000001, "Arpita", 28985, 4.0);
		Current c = new Current(1000000010, "LTI Ltd", 900000, 50000);
		entityManager.getTransaction().begin();
		entityManager.persist(s);
		entityManager.persist(c);
		entityManager.getTransaction().commit();
		
	}

}
