package com.training.assign;

public class Student {
	
	private String name;
	private  double mark;
	private int rollnum;
	
	public static String trainerName;
	
	
	public Student() {
	
	}


	public Student (String name, double mark, int rollnum) throws RangeCheckException {
	      super();
		this.name = name;
		if(mark>=0 &&mark<=100) {
			this.mark = mark;
		}
		else {
			throw new RangeCheckException("Out of range!!!!");
		}
		this.rollnum = rollnum;
	}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollnum() {
		return rollnum;
	}


	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}


	public double getMark() {
		return mark;
	}


	public void setMark(double mark) {
		try {
			if(mark>=0 && mark<=100)
			{
				this.mark = mark;
			}
			else {
				throw new RangeCheckException("Out of range!!!!");
			}
		} catch (RangeCheckException e) {
			// TODO: handle exception
		   System.out.println(e.getMessage());
		   System.out.println("Mark must be in the range 0-100");
			
		}
	
	}
	public String assignGrade() {
		
	 //local variables must be initialized with some value
		String grade="0";
		if(this.mark>80)
		{
			grade="A";
		}
		return grade;
	}
	

}
