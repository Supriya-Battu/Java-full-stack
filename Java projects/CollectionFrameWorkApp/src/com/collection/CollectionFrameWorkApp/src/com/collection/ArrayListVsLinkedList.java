package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		LinkedList<Integer> ll = new LinkedList();
		long StartTime = System.currentTimeMillis();
		
		//insert
		for(int i=9999;i>=1;i--)
		{
			al.add(i);
		}
		long endTime = System.currentTimeMillis();
		long result  = endTime - StartTime;
		System.out.println("Array "+result);
		
		StartTime = System.currentTimeMillis();
		for(int i=9999;i>=1;i--)
		{
			ll.add(i);
		}
		endTime = System.currentTimeMillis();
		result  = endTime - StartTime;
		System.out.println("Linked "+result);
		//get
		StartTime = System.currentTimeMillis();
		for(int i=9999;i>=1;i--)
		{
			al.get(i);
		}
		endTime = System.currentTimeMillis();
		result  = endTime - StartTime;
		System.out.println("Arraylist gettime "+result);
		StartTime = System.currentTimeMillis();
		for(int i=9999;i>=1;i--)
		{
			ll.get(i);
		}
		endTime = System.currentTimeMillis();
		result  = endTime - StartTime;
		System.out.println("Linkedlist gettime "+result);
		//remove
		StartTime = System.currentTimeMillis();
		for(int i=9999;i>=1;i--)
		{
			al.remove(i);
		}
		endTime = System.currentTimeMillis();
		result  = endTime - StartTime;
		System.out.println("Arraylist gettime "+result);
		StartTime = System.currentTimeMillis();
		for(int i=9999;i>=1;i--)
		{
			ll.remove(i);
		}
		endTime = System.currentTimeMillis();
		result  = endTime - StartTime;
		System.out.println("Linkedlist gettime "+result);
	}
	

}
//linked list takes more time  