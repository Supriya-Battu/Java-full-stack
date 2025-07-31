package com.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CatchwithTryCatch {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
			System.out.println(a/b);
			
		}
		catch(Exception e)
		{
			try {
				FileWriter fw = new FileWriter("ExceptionInfo.txt");
				Date d =new Date();
				
				//convert exception object data into string
				String msg = e.toString();
				String msg1 = d.toString();
				
				//To Write 
				fw.write(msg);//log message
				fw.write(msg1);
				System.out.println("Success");
				//To close
				fw.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
