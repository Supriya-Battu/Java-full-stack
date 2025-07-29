package com.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) throws IOException {
		//Data
		String msg = "Welcome to Java Full Stack";
		// To input Data into file
		FileOutputStream fos = new FileOutputStream("Input.txt");
		//convert string to byte      
		byte[] b = msg.getBytes();
		// to write Data
		fos.write(b);
		// for confirmation
		System.out.println("Operation success");
		//close objects
		fos.close();
	}

}
