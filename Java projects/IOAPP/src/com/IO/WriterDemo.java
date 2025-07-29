package com.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

	public static void main(String[] args) throws IOException {
		//Data
		String msg = "Weclome to RISE";
		String msg1 = "Welcome to Java full stack";
		//to write into file 
		//the true makes the file to write all & not to over ride
		FileWriter fw = new FileWriter("Demo.txt",true);
		
		//to write 
		 fw.write(msg);
		//fw.write(msg1);
		// to confirm 
		System.out.println("Success");
		
		//close object
		fw.close();
		fw.close();
 	}

}
