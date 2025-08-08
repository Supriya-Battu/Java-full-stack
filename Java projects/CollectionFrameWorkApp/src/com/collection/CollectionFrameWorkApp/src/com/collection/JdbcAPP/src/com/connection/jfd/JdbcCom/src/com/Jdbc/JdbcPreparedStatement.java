package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcPreparedStatement {

	public static void main(String[] args)  {
		//global
		Connection con = null;
		PreparedStatement ps = null;
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.establish connection
			con  = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/amazon",
					"root",
					"root");
			//prepare query
			String q = "insert into product values(?,?,?)";//?place holders
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Amazon Portal");
			System.out.println("please enter product details:");
			System.out.println("enter product id: ");
			int pid = sc.nextInt();
			System.out.println("Enter product details: ");
			String pname = sc.next();
			System.out.println("Enter product price: ");
			int price = sc.nextInt();
			//statement object (vehicle
			ps = con.prepareStatement(q);
			//set values
			ps.setInt(1, pid);
			ps.setString(2, pname);
			ps.setInt(3, price);
			//execute and process the query
			int result = ps.executeUpdate();
			//business logic
			if(result!=0)
			{
				System.out.println("Record inserted");
			}
			else
			{
				System.out.println("Record not inserted");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
/*package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCPreparedStatement {

	public static void main(String[] args) {
		//global
		Connection con = null;
		PreparedStatement ps = null;
		try {
			
			//1.load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.establish connection
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/am
con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/amazon",
					"root",
					"root");
			
			//3.Prepare query
			String q = "insert into product values(?,?,?)"; //?-place holders
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to amazon portal");
			System.out.println("Please enter product details:");
			System.out.println("Enter product id:");
			int pid = sc.nextInt();
			System.out.println("Enter product name");
			String pname = sc.next();
			System
228A1A05A1 SRIKARAM SIVA MEGHANA
2:26 PM
String pname = sc.next();
			System.out.println("Enter product price");
			int price = sc.nextInt();
			
			//4.statement object (Vehicle)
			ps = con.prepareStatement(q);
			//set values
			ps.setInt(1, pid);
			ps.setString(2, pname);
			ps.setInt(3, price);
			
			//5.execute and process the query
			int result = ps.executeUpdate();
			
			//business logic
			if(result!=0) {
				System.out.println("Record inserted");
			}
			else {
				System.out.println("Record Notinserted");
			}
	
			
		}
} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}*/
