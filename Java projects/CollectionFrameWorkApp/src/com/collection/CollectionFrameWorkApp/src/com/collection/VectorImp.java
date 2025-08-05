package com.collection;

import java.util.Vector;

public class VectorImp {

	public static void main(String[] args) {
		//Create collection Object
		Vector al = new Vector();
		//1.insert
		al.add(10);
		al.add("priya");
		al.add(true);
		al.add(123456789);
		//adding duplicate
		al.add(10);
		//adding null values
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		//2.delete/remove
		al.remove(2);//2 is index
		System.out.println(al);
		System.out.println(al.size());
		//3.Search
		System.out.println(al.contains("priya"));
		//4.Get/retrieve
		System.out.println(al.get(2));//2 is index 
		//5.Sorting
		

	}
}
