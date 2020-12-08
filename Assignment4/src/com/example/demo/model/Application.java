package com.example.demo.model;

import java.util.Scanner;

import com.example.demo.BankAccount;
import com.example.demo.BusinessAccount;
import com.example.demo.SavingsAccount;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Savingss Account");
		BankAccount account1=new SavingsAccount(273634834, "Ram", 10000, "Seetha");
		System.out.println("enter the amount to be depositted");
		double eamount=sc.nextDouble();
		account1.deposit(eamount);
		System.out.println("Current balance: "+account1.getCurrBalance());
		System.out.println("enter the amount to be withdrawn");
		double wamount=sc.nextDouble();
	    account1.withdraw(wamount);
		System.out.println("Current balance: "+account1.getCurrBalance());
		
		System.out.println("-----------------------------------");
		System.out.println("Business Account");
		BankAccount account2=new BusinessAccount(68236294, "Hari", 30000, "Sam");
		System.out.println("enter the amount to be depositted");
		double damount=sc.nextDouble();
		account2.deposit(damount);
		
		System.out.println("Current balance: "+account2.getCurrBalance());
		System.out.println("enter the amount to be withdrawn");
		double wamount1=sc.nextDouble();
		account2.withdraw(wamount1);
		System.out.println("Current balance: "+account2.getCurrBalance());

	}

}
