package com.assign.demo;

public class Billing {
 private String name;
 private long phone;
 private int plan;
 
 public static String internetProvider="metronet";
 
 //constructor without arguments
 public Billing()
 {
	 
 }
//constructor with arguments
public Billing(String name, long phone, int plan) {
	super();
	this.name = name;
	this.phone = phone;
	this.plan = plan;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public int getPlan() {
	return plan;
}
public void setPlan(int plan) {
	this.plan = plan;
}



}
