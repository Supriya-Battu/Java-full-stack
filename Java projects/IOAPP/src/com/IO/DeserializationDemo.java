//Deserialization - to retrive from file

package com.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

		public static void main(String[] args) throws IOException, ClassNotFoundException {
			
			 // to read info from a file 
			 FileInputStream fis = new FileInputStream("EmployeeInfo.txt");
			 // to read from object 
			 ObjectInputStream ois= new ObjectInputStream(fis);
			 //To read 
			 Employee e = (Employee) ois.readObject();
			 System.out.println(e.getEid()+" "+e.getEname()+" "+ e.getMobileno()+" "+e.getSalary());
			 //close object
			 ois.close();
			 fis.close();
			 	 
	}

}
