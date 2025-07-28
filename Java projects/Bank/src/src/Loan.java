package src;

import java.util.Scanner;

public class Loan extends Customer{
	//fields
	int lid;
	double loanamt;
	String loanType;
	//Constructor
	Loan(int lid, double loanamt, String loanType,int cid,String cname,String address,long moblienumber)
	{
		super(cid,cname,address,moblienumber);
		{
			this.lid=lid;
			this.loanamt=loanamt;
			this.loanType=loanType;
		}
	}
	void getloanDetails()
	{
		System.out.println("lid "+lid);
		System.out.println("loan amount "+loanamt);
		System.out.println("loan type "+loanType);

	}
	public static void main(String[] args)
	{
		Loan l = new Loan(111,20000,"personal",1001,"ram","hyd",9934646);
		l.getCustomerDetails();
		l.getloanDetails();
	}

}

