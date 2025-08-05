package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class NameComporator implements Comparator<Employee>

{
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e2.getEname().compareTo(e1.getEname());
		//Increasing 
		//return e1.getEname().compareTo(e2.getEname());
	}
class SalaryComprator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getSal() == e2.getSal())
		{
			return 0;
		}
		else if(e1.getSal() < e2.getSal())
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}
	
}
}

public class ArrayListComporator {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e = new Employee(1001,"Rahul",50000);
		Employee e1 = new Employee(1007,"Abhi",45000);
		Employee e2 = new Employee(1004,"Dulquer",15000);
		//add
		al.add(e);
		al.add(e1);
		al.add(e2);
		//(sorting with names)
		Collections.sort(al, new NameComporator());
		//to retrieve vlaues based on name 
		for(Employee emp : al)
		{
			System.out.println(emp.getEid()+" "+emp.getEname()+" "
			+emp.getSal());
		}
		//Results based on emp salary
		
	}

}
