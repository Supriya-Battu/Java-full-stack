package com.exception;

public class ThrowDemo {
	//methods
	static void checkEligibility(int age)
	{
		if (age < 18)
		{
			throw new ArithmeticException("Not Eligible to vote");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[] args) {
		checkEligibility(10);

	}

}
