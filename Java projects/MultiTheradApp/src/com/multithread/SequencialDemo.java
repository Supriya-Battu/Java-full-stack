package com.multithread;

public class SequencialDemo {

	//method
	void productDetails()
	{
		for (int i=1; i<=10;i++)
		{
			System.out.println("Realme model :"+i);
		}
	}
	public static void main(String[] args) {
		//create object
		SequencialDemo sd = new SequencialDemo();
		sd.productDetails();
		for (int i=1; i<=10;i++)
		{
			System.out.println("OnePlus model :"+i);
		}

	}

}
