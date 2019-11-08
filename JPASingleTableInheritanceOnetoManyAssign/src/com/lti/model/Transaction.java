package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction {
	
	@Id
	@Column(name="trans_id")
	private long transactionId;
	@Column(name="trans_amt")
	private long trasactionAmt;
	
	@ManyToOne
	@JoinColumn(name="acc_num")
	private Account account;
	
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Transaction() {
		super();
	}

	public Transaction(long transactionId, long trasactionAmt) {
		super();
		this.transactionId = transactionId;
		this.trasactionAmt = trasactionAmt;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public long getTrasactionAmt() {
		return trasactionAmt;
	}

	public void setTrasactionAmt(long trasactionAmt) {
		this.trasactionAmt = trasactionAmt;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", trasactionAmt=" + trasactionAmt + "]";
	}
	
	
	
	

}
