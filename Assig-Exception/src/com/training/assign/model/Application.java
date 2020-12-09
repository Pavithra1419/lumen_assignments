package com.training.assign.model;

import com.training.assign.RangeCheckException;
import com.training.assign.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student1=new Student();
        student1.setMark(103);
        
        try {
			Student student2=new Student("Ram",134,105);
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Mark must be in the range 0-100");
		}
	}

}
