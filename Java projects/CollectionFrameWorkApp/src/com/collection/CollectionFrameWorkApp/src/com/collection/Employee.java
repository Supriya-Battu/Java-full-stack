package com.collection;

public class Employee {

	private int eid;
	private String ename;
	private int sal;
		//constructor
		public Employee(int eid, String ename, int sal) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.sal = sal;
		}
		//fileds
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
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
		
		
	}
	
