package com.lti.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="saving")
public class Savings extends Account{
	private double roi;

	public Savings() {
		super();
		
	}


	public Savings(long accountNumber, String accountHolderName, double accountBalance, double roi) {
		super(accountNumber, accountHolderName, accountBalance);
		this.roi = roi;
	}


	public double getRoi() {
		return roi;
	}


	public void setRoi(double roi) {
		this.roi = roi;
	}


	@Override
	public String toString() {
		return "Savings [roi=" + roi + ", toString()=" + super.toString() + "]";
	}
	
	



}
