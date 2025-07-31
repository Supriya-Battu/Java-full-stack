package com.exception;

public class TryWithMultipleTimesCatch {

	public static void main(String[] args) {
		int a=10,b=0;
		int array[]= {1,2,2};
		try {
			System.out.println(a/b);
		}
		catch (ArrayIndexOutOfBoundsException aoe)
		{
			aoe.printStackTrace();//Sub exception 
		}
		catch(Exception e)//super exception
		{
			e.printStackTrace();
		}
		System.out.println("Hi");
	}

}
// there is problem if we change Super exception to sub exception & vice versa