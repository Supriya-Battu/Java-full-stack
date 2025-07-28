package com.ecom;

public class ProductDemo implements Product {

	//fields
	int pid;
	String pname;
	double price;
	//constructor
	ProductDemo(int pid,String pname,double price)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	@Override
	public void getProductDetails() {
		System.out.println(pid);
		System.out.println(pname);
		System.out.println(price);
		
	}
	@Override
	public void offerdetails() {
		System.out.println("50% off on every product");
		
	}
	public static void main(String[] args)
	{
		//creating object
		Product p= new ProductDemo(1001,"ibm",20000);
		p.getProductDetails();
		p.offerdetails();
	}
}
