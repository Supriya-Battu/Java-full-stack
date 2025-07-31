package com.exception;

public class ExceptionDemo5 {
	void show()
	{
		System.out.println("Welcome to java FSD");
	}
	public static void main(String[] args)
	{
		//Create object
		ExceptionDemo5 ed = null;//when no object created then its nullpointerException
		ed.show();
	}

}
