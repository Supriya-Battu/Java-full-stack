package com.exception;

public class Tricky {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
		System.out.println("Full Stack");
		System.exit(0);//To terminate
		System.out.println(a/b);
		System.out.println("Welcome");//after exception identified then other statement doesn't print
		
		}
		/*catch(Throwable t)
		{
			//we can write throwable class instead of exception class
			t.printStackTrace();
		}*/
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		System.out.println("HI");
		System.out.println("HELLO");
	}

}
