package com.string;

public class StringDemo {

	public static void main(String[] args)
	{
		//literal syntax
		String sName = "Priya";//String constant pool(scp area)
		System.out.println(sName);
		
		//object syntax
		String sName1 = new String("Priya");//Heap area 
		System.out.println(sName1);
		
		String sName2  = "Priya";
		System.out.println(sName2);
		
		String sName3 = new String("Priya");//Heap area 
		System.out.println(sName3);
		
		//String is immutable
		sName.concat(" Battu");
		System.out.println(sName);
		
		// to implement mutable
		//stringbuffer is not safe for threads
		//stringbuilder is threadsafe
		StringBuffer sb = new StringBuffer("PRIYA");
		sb.append(" Battu");
		System.out.println(sb);
		
		// String methods
		//concate: 1. + ,2. concat()
		System.out.println(sName + sName1);
		//how to get part of a string 
		//subString()
		String course = "Java Full Stack";
		System.out.println(course.substring(5));
		System.out.println(course.substring(5,9));
		// Replace
		System.out.println(course.replace("Full Stack", "FSD"));
		//compare
		//== or equals()
		System.out.println(sName == sName1);//== focuses on both value and reference
		System.out.println(sName.equals(sName1));// equals() focuses on value only
		// to get index value
		//1.indexOf(), 2. lastIndexOf()
		String mes = "Welcome to RISE Welcome to  Java FSD";
		System.out.println(mes.indexOf("Welcome"));
		System.out.println(mes.lastIndexOf("Welcome"));
	
		//To check part of String
		//contains()
		System.out.println(mes.contains("Java"));
		
		//Trim 
		String product = " Realme ";
		System.out.println(product.length());
		System.out.println(product.trim());
		System.out.println(product.trim().length());
		
		
		//New methods of string 
		//StartWith()
		//endsWith()
		System.out.println(mes.startsWith("Welcome"));
		System.out.println(mes.endsWith("FSD"));
		
	
	}
}
//In java, the string name has same string in other creating strings the scpa checks and if it is created already it doesn't give new memory 
//but in heap there is no such thing it creates memory every time even it exists so we follow literal syntax
