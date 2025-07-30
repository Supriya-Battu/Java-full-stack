//complier exception
package com.exception;

import java.sql.Connection;
import java.sql.DriverManager;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection(null);
		System.out.println("HI");

	}

}
