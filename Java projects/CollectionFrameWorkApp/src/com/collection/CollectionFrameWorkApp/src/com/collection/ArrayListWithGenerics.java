package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithGenerics {

	public static void main(String[] args) {
		//Generics
		// there are 8 primitive datatypes they are Wrapper classes 
		//here Integer is class in lang package
		ArrayList <Integer> al = new ArrayList();
		al.add(20);
		al.add(40);
		al.add(30);
		al.add(10);
		al.add(5);
		System.out.println(al);
		System.out.println(al.size());
		//Sorting
		Collections.sort(al);
		System.out.println(al);
	}

}
