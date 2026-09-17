package com.example.bank.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Transaction {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int id;
		String transactiontype;
		double amount;
		LocalDateTime transactiondate;
		@ManyToOne
		@JoinColumn(name="account_id")
		Account account;
		public Transaction() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Transaction(String tranasactiontype, double amount, LocalDateTime transactiondate, Account account) {
			super();
			this.transactiontype = tranasactiontype;
			this.amount = amount;
			this.transactiondate = transactiondate;
			this.account = account;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTransactiontype() {
			return transactiontype;
		}
		public void setTranasactiontype(String transactiontype) {
			this.transactiontype = transactiontype;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public LocalDateTime getTransactiondate() {
			return transactiondate;
		}
		public void setTransactiondate(LocalDateTime transactiondate) {
			this.transactiondate = transactiondate;
		}
		public Account getAccount() {
			return account;
		}
		public void setAccount(Account account) {
			this.account = account;
		}
		
		

}
