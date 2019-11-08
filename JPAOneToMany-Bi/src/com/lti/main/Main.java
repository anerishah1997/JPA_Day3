package com.lti.main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Department;
import com.lti.model.Employee;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		Department dept = new Department(10, "Development");
		Employee e1 = new Employee(101, "Aneri", 25000);
		Employee e2 = new Employee(102, "Arpita", 27000);
		Employee e3 = new Employee(103, "Shekhar", 24000);
		
		Set<Employee> setOfEmp = new HashSet<>();
		setOfEmp.add(e1);
		setOfEmp.add(e2);
		setOfEmp.add(e3);
		
		dept.setEmployees(setOfEmp);
		
		e1.setDepartment(dept);
		e2.setDepartment(dept);
		e3.setDepartment(dept);
		
		//add 3 emloyees 
		/*dept.addEmployee(e1);
		dept.addEmployee(e2);
		dept.addEmployee(e3);*/
		
		entityManager.getTransaction().begin();
		entityManager.persist(dept);
		entityManager.getTransaction().commit();
		
		
	}

}
