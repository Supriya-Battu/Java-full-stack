package com.bank;
//fundamentals
public class ConstructorDemo {
	//constructor
	ConstructorDemo()
	{
		System.out.println("hi");
	}
	//parameter constructor
	ConstructorDemo(int a, int b)
	{
		System.out.println(a+" "+ b);
	}
	public static void main(String[] args)
	{
		//create obj
		ConstructorDemo cd= new ConstructorDemo();
	    ConstructorDemo cd1 = new ConstructorDemo(10,20);
		//we won't call methods when we use constructor 2 types of constructor 1.default 2.parameterized
	}

}
