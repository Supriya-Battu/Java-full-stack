package com.IO;

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		//Reader class
		FileReader fr = new FileReader("Demo.txt");

		//To read 
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		//close object
		fr.close();
	}

}
