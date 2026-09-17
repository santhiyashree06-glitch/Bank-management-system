package com.example.bank.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String accNo;
	String acctype;
	double balance;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	customer cust;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accNo, String acctype, double balance, customer cust) {
		super();
		this.accNo = accNo;
		this.acctype = acctype;
		this.balance = balance;
		this.cust = cust;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public customer getCust() {
		return cust;
	}
	public void setCust(customer cust) {
		this.cust = cust;
	}
	
	

	

}
