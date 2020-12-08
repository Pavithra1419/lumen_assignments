package com.example.demo.model;

import java.util.Scanner;

import com.example.demo.Housing;
import com.example.demo.Loan;

public class Application {
	
	
 public static void main(String args[])
 {
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your cibil score");
	 int cb=sc.nextInt();
	 System.out.println("enter the loan amount:");
	 double amt=sc.nextDouble();
	 Loan loan=new Loan(cb,amt);
	 System.out.println("Rate of interest:");
	 System.out.println(loan.findInterest(cb));
	 
	
	 System.out.println("enter property type");
	 String prop=sc.next(); 
	 Housing house=new Housing(cb,amt,prop);
	 
	 System.out.println("The final amount to be paid");
	 System.out.println(house.findInterest(cb));
	 sc.close();
 }
}
