package com.casting;

public class Demo {

	public static void main(String [] args)
	{
		int a=10;
		double b;
		// implicit casting (widening)0
		b=a;
		System.out.println(b);
		
		double c = 25.5;
		int  d  ;
		//Type mismatch: cannot convert from double to int if d=c
		//Explicit casting 
		d = (int)c ;
		System.out.print(d);
		
	}
}
