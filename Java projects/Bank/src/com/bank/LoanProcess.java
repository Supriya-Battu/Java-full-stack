//polymorphism
package com.bank;

public class LoanProcess {

	void loan(int loanamt,int gst,int pfee)
	{
		System.out.println("personal "+(loanamt-gst-pfee));
		
	}
	void loan(int loanamt,int pfee)
	{
		System.out.println("home "+(loanamt-pfee));
	}
	public static void main(String[] args)
	{
		//create object
		LoanProcess  lp = new LoanProcess();
		lp.loan(5000,200,300);
		lp.loan(5000,300);
	}
}
