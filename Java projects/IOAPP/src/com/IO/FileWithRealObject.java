//Serialization = marker interface cause it doesn't have methods used to write 
package com.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWithRealObject {

	public static void main(String[] args) throws IOException {
		// create object with required details
		 Employee e = new  Employee(1001,"Priya",98746589,30000);
		 // to write info into a file 
		 FileOutputStream fos = new FileOutputStream("EmployeeInfo.txt");
		 // to write an object 
		 ObjectOutputStream oos = new ObjectOutputStream(fos);
		 //To write 
		 oos.writeObject(e);
		 //close object
		 oos.close();
		 fos.close();
		 
	}

}
