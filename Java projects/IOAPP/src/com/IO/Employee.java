//pojo class
package com.IO;

import java.io.Serializable;

public class Employee implements Serializable{
	//fields
	private int eid;
	private String ename;
	private long mobileno;
	private double salary;
	//constructor
	public Employee(int eid, String ename, long mobileno, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mobileno = mobileno;
		this.salary = salary;
	}
	//methods
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//To String
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mobileno=" + mobileno + ", salary=" + salary + "]";
	}
	
}
