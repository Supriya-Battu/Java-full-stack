package com.exception;

public class TryWithTryCatch {

	public static void main(String[] args) {
		int a=10,b=0;
		int array[]= {1,2,3};
		try {//try { try{ array } catch(array){aie.pr} sys.a/b} catch(exception e){}
			System.out.println(a/b);
			try
			{
				System.out.println(array[5]);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		/*finally 
		{
			System.out.println("Complete");
		}*/
	}

}
