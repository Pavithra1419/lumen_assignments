package com.example.demo;

public class SavingsAccount extends BankAccount {
	private String nominee;

	public SavingsAccount(long accountNumber, String accountName, double currBalance, String nominee) {
		super(accountNumber, accountName, currBalance);
		this.nominee = nominee;
	}

	@Override
	public double deposit(double amt) {
		// TODO Auto-generated method stub
		double currbal=getCurrBalance();
		double newbal=0;
		if(amt<100000) {
			newbal=currbal+amt;
			setCurrBalance(newbal);
			System.out.println("Depositted successfully!");
		}
		else {
			System.out.println("You can only deposit 100000Rs at a time!!!");
			
		}
		
		return newbal;
	}

	@Override
	public double withdraw(double amt) {
		// TODO Auto-generated method stub
		double currbal=getCurrBalance();
		double newbal=currbal-amt;
		if(newbal<5000)
		{
		  System.out.println("You need to maintain minimum balance of 5000Rs");	
		}
		else {
			setCurrBalance(newbal);
		}
		
		return newbal;
		
	}
}
