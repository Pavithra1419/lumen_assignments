package com.example.demo;

public class Loan {
	public int cibilScore;
	public double loanAmount;
	
	
	public Loan() {
		super();
	}
    public Loan(int cibilScore,double loanAmount) {
		super();
		this.cibilScore = cibilScore;
		this.loanAmount=loanAmount;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	
	//calculates the rate of Interest based on cibil score 
	//this rate of interest is used by Overridden method in extended class
	public double findInterest(int cibil)
	{   double intRate;
		if(cibil>500)
		{
			intRate=7.5;
		}
		else
		{
			intRate=8.2;
		}
		return intRate;
	}
    
	
	

}
