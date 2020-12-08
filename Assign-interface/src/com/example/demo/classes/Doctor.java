package com.example.demo.classes;

import com.example.demo.Billable;

public class Doctor implements Billable {
    private String name;
    private String dept;
    
    
	public Doctor(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}

   @Override
	public double calculate() {
		// TODO Auto-generated method stub
		double salary;
		if(dept.equalsIgnoreCase("dermatolagist"))
		{
			salary=60000;
		}
		else if(dept.equalsIgnoreCase("dentist"))
		{
			salary=55000;
		}
		else if(dept.equalsIgnoreCase("gynecologist"))
		{
			salary=65000;
		}
		else {
			salary=40000;
		}
		return salary;
	}

}
