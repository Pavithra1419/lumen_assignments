package com.assign.demo;

public class Application {
	//method to calculate the billing amount
	public static Double getAmount(int plan)
	{  Double amount=5000.00D;
		if(plan<299)
		{    amount=500.00D;
			return amount;
		}
		else if(plan>=299&&plan<999) {
			amount=1000.00D;
			return amount;
		}
		else {
		return amount;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Billing ram=new Billing("Ram",686281789,399);
		System.out.println("Customer Details");
		System.out.println("-----------------------------------------------------");
		System.out.println("Name: "+ram.getName());
		System.out.println("Phone number: "+ram.getPhone());
		System.out.println("Plan taken: "+ram.getPlan());
		System.out.println("Internet Provider: "+ram.internetProvider);
		
		
		System.out.println("Amount to be paid "+getAmount(ram.getPlan())+"Rs");
		
		

	}

}
