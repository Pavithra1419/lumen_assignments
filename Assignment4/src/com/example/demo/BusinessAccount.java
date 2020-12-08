package com.example.demo;

public class BusinessAccount extends BankAccount {

	private String businessType;

	public BusinessAccount(long accountNumber, String accountName, double currBalance, String businessType) {
		super(accountNumber, accountName, currBalance);
		this.businessType = businessType;
	}

	@Override
	public double deposit(double amt) {
		// TODO Auto-generated method stub
		double currbal=getCurrBalance();
		double newbal=0;
		if(amt<1000000) {
			newbal=currbal+amt;
			setCurrBalance(newbal);
			System.out.println("Depositted successfully!");
		}
		else {
			System.out.println("You can only deposit 1000000Rs at a time!!!");
			
		}
		return newbal;
	}

	@Override
	public double withdraw(double amt) {
		// TODO Auto-generated method stub
		double currbal=getCurrBalance();
		double newbal=currbal-amt;
		if(newbal<25000)
		{
		  System.out.println("You need to maintain minimum balance of 25000Rs");	
		}
		else {
			setCurrBalance(newbal);
		}
		
		return newbal;
	}

}
