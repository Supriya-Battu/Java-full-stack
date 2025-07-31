package com.exception;

class GreaterMarksException extends RuntimeException{//remove runtime 
	
}
class Student
{
	//fields
	int rollno;
	String sname;
	int marks;
	
	//constructor
	Student(int rollno,String sname,int marks)
	{
		this.rollno=rollno;
		this.sname=sname;
		this.marks=marks;
	}
	//Business logic
	void insert()
	{
		if (marks>100)
		{
			throw new GreaterMarksException();
		}
		else
		{
			System.out.println("Your details are with us");
		}
	}
}
public class CustomExceptionDemo {

	
	public static void main(String[] args) {
		//create object
		Student s = new Student(1001,"Priya",99);
		s.insert();
		Student s1 = new Student(1002,"lahari",102);
		s1.insert();

	}

}
