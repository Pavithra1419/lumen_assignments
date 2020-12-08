/**
 * 
 */
package com.example.demo.classes;

import com.example.demo.Billable;

/**
 * @author AC81651
 *
 */
public class Engineer implements Billable {
   
	private String stream;
	private String name;
	
   public String getStream() {
		return stream;
	}
  public void setStream(String stream) {
		this.stream = stream;
	}

  public String getName() {
		return name;
	}

   public void setName(String name) {
		this.name = name;
	}

    public Engineer(String stream, String name) {
		super();
		this.stream = stream;
		this.name = name;
	}



	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		double salary;
		if(stream.equalsIgnoreCase("Software"))
		{
			salary=55000;
		}
		else if(stream.equalsIgnoreCase("Mechanical"))
		{
			salary=40000;
		}
		else {
			salary=35000;
		}
		return salary;
	}

	

}
