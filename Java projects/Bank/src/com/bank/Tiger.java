package com.bank;

public class Tiger extends Cat{
	//method overriding
	void sound()
	{
		System.out.println("ROAR");
	}
	public static void main(String[] args)
	
	
	{
		//create object
		Cat c;
		c=new Cat();
		c.sound();
		c=new Tiger();
		c.sound();
	}
}
