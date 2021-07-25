package com.example.models;

public class Transaction {

	private int id;
	private int accountSen;
	private int accountRec;
	private double transactionAmount;


	public Transaction() {

	}
	


	public Transaction(int id, int accountSen, int accountRec, double transactionAmount) {
		super();
		this.id=id;
		this.accountSen=accountSen;
		this.accountRec=accountRec;
		this.transactionAmount=transactionAmount;
				

	}
	
	public Transaction(int accountSen, int accountRec, double transactionAmount) {
		this.accountSen=accountSen;
		this.accountRec=accountRec;
		this.transactionAmount=transactionAmount;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getAccountSen() {
		return accountSen;
	}



	public void setAccountSen(int accountSen) {
		this.accountSen = accountSen;
	}



	public int getAccountRec() {
		return accountRec;
	}



	public void setAccountRec(int accountRec) {
		this.accountRec = accountRec;
	}



	public double getTransactionAmount() {
		return transactionAmount;
	}



	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}



	@Override
	public String toString() {
		return "Transaction [id=" + id + ", accountSen=" + accountSen + ", accountRec=" + accountRec
				+ ", transactionAmount=" + transactionAmount + "]";
	}


	
}