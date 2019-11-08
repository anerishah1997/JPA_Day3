package com.lti.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Address;
import com.lti.model.Student;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		Student student = new Student(46, "Aneri", 80.76);
		Address address = new Address("Vadodara", "Gujarat", "390011");
		student.setAddress(address); // says that address data will be inserted into f.k col  ----  Java Association
		
		entityManager.getTransaction().begin();
		//entityManager.persist(address);
		
		entityManager.persist(student);
		entityManager.getTransaction().commit();

		 Student student2 = entityManager.find(Student.class, student.getStudentId()); // fetch Address's details also
		 System.out.println(student2);
		 //System.out.println(student2.getAddress());
	}

}
