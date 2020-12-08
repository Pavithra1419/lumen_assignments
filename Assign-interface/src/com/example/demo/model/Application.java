package com.example.demo.model;

import java.util.Scanner;

import com.example.demo.classes.Doctor;
import com.example.demo.classes.Engineer;
import com.example.demo.services.Services;

public class Application {
    public static void main(String args[])
    {   
    	System.out.println("Enter the code of your profession");
    	System.out.println("1.Engineer 2.Doctor");
    	Scanner sc=new Scanner(System.in);
    	int key=sc.nextInt();
    	Services serv=new Services();
    	if(key==1) {
    		System.out.println("Enter your name");
    		String ename=sc.next();
    		System.out.println("Enter your stream");
    		String estream=sc.next();
    		Engineer eng=new Engineer(estream,ename);
        	System.out.println("Salary of "+eng.getName()+":");
        
        	serv.print(eng);
    	}
    	else {
    		System.out.println("Enter your name");
    		String dname=sc.next();
    		System.out.println("Enter your stream");
    		String dstream=sc.next();
    	Doctor doc=new Doctor(dname,dstream);
    	System.out.println("Salary of "+doc.getName());
    	serv.print(doc);
    	}
    }
}
