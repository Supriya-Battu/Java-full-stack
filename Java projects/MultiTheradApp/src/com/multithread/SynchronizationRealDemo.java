package com.multithread;

import java.util.Scanner;

class Account {
	//fields
	long accno;
	int bal;
	//constructor
	Account(long accno,int bal)
	{
		this.accno = accno;
		this.bal = bal;
	}
	public boolean isSufficientBalance(int amount)
	{
		if(amount <= bal)
		{
			return true;
		}
		else
		{	
		return false;
		}
		
	}//method issufficientbalance() close
	public void withdraw(int amount)
	{
		bal = bal-amount;
		System.out.println("With drawal amount: "+amount);
		System.out.println("Current Balance: "+bal);
		
	}//withdraw() close
}//Account () close
class Customer implements Runnable
{
	//fields
	String cname;
	Account acc;//referencing 
	//constructor
	Customer(String cname,Account acc)
	{
		this.cname = cname;
		this.acc = acc;
	}
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to SBI");
		synchronized(acc)
		{
		System.out.println(cname+" Please enter Amount to withdraw");
		int amount = sc.nextInt();
		if(acc.isSufficientBalance(amount))
		{
			acc.withdraw(amount);
		}
		else
		{
			System.out.println("Sorry Insufficient Balance.");
		}
		}//end of synchronization
	}
}
public class SynchronizationRealDemo  {

	public static void main(String[] args) {
		Account ac = new Account(1234567,1000);
		Customer c  = new Customer("Priya",ac);
		Customer c1 = new Customer("Riya",ac);
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c1);
		t1.start();
		t2.start();
		
	}

}
