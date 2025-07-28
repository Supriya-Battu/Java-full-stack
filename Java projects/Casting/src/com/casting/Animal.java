package com.casting;


	
class Cat{
	void sound()
	{
		System.out.println("MEOW");
	}
}

class Tiger extends Cat
{

	void sound()
	{
	System.out.println("Roar");
	}
	void food()
	{
		System.out.println("NON VEG");
	}
}
public class Animal {

	public static void main(String [] args)
	{
		Cat c;//Reference variable
		c= new Cat();
		c.sound();
		c = new Tiger();
		c.sound();
		//class casting 
		((Tiger)c).food();
	}
	
}
