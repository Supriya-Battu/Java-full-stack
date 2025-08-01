package com.exception;

import java.io.IOException;

// we get error/confuse while using throws in overriding
class Test
{
	//method 
	void show() throws Exception
	{
		System.out.println("Hi");
	}
}
public class ExceptionmethodOverriding  extends Test {

	//method
	//1.if super class method doesn't declare any exception then in sub class don't declare compile time exception
	//2. if super class method doesn't declare any exception then in its subclass we can declare runtime exception
	//3. if super class method declare any exception then its sub class we need to declare same exception or sub exception but not super exception
	
	
	void show() throws IOException
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		//reference variable
		Test t;
		t = new Test();
		t.show();
		t=new ExceptionmethodOverriding();
		t.show();

	}

}
