package com.example.demo.services;

import com.example.demo.Billable;

public class Services {
   public void print(Billable bill)
   {
	  System.out.println(bill.calculate()); 
   }
}
