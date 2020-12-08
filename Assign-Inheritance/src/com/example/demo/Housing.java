package com.example.demo;

public class Housing extends Loan {
	
	public String property;

	public Housing() {
		super();
	}
    public Housing( int cibil,double amount,String property) {
		super(cibil,amount);
		
		this.property = property;
		
	}

    @Override
	public double findInterest(int cibil) {
		// TODO Auto-generated method stub
		double finalAmount;
		int time;
		double rate= super.findInterest(cibil);
		
		//based on the loan amount it assigns the time period
		if(getLoanAmount()<1000000)
		{   time=2;
			finalAmount=getLoanAmount()+((getLoanAmount()*time*rate)/100);
		}
		else if(getLoanAmount()>=1000000 && getLoanAmount()<2500000){
			 time=4;
				finalAmount=getLoanAmount()+((getLoanAmount()*time*rate)/100);
		}
		else {
			 time=6;
				finalAmount=getLoanAmount()+((getLoanAmount()*time*rate)/100);
		}
		
	    return finalAmount;
		
	
	}
	


	
	
	

}
