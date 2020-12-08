package com.example.demo;

public abstract class BankAccount {
	private long accountNumber;
	  private String accountName;
	  private double currBalance;
	  
	  //abstract class can have constructor but not instantiation
	  public BankAccount(long accountNumber, String accountName, double currBalance) {
			super();
			this.accountNumber = accountNumber;
			this.accountName = accountName;
			this.currBalance = currBalance;
		}
	//can have non abstract method  
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getCurrBalance() {
		return currBalance;
	}

	public void setCurrBalance(double currBalance) {
		this.currBalance = currBalance;
	}
	public abstract double deposit(double amt);
	public abstract double withdraw(double amt);


}
