package com.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo {

	public static void main(String[] args) throws IOException {
		//FileInputStream class
		FileInputStream fis = new FileInputStream("Demo.txt");
		
		//to read
		//-1 indicates end of file(eof)
		int i;
		while ((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		//close object
		fis.close();

	}

}
