package com.lti.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="currents")
public class Current extends Account{
	
	private double overdraf;

	
	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(long accountNumber, String accountHolderName, double accountBalance, double overdraf) {
		super(accountNumber, accountHolderName, accountBalance);
		this.overdraf = overdraf;
	}

	public double getOverdraf() {
		return overdraf;
	}

	public void setOverdraf(double overdraf) {
		this.overdraf = overdraf;
	}

	@Override
	public String toString() {
		return "Current [overdraf=" + overdraf + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
