package com.exception;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		//We use try when we think an exception may occur 
		try {
		System.out.println(a/b);
		} //try 
		//catch when we you know u exception can write or else use below 
		catch(Exception e )
		{
			//System.out.println(e);
			e.printStackTrace();//to know where error occurred & at which it occurred 
		}//catch
		System.out.println("HI");
	}
}
