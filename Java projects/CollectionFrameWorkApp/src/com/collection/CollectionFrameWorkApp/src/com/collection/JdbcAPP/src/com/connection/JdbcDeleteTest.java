package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDeleteTest {

	public static void main(String[] args) {
		//global object
		Connection con = null;
		Statement st =null; 
		try {
			//1. load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.Establish Connection
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/amazon",
					"root",
					"root");
			//3.Prepare query
			String qry = "DELETE FROM product WHERE pid = 2002";


			//4.Create statement (vehicle)
			st = con.createStatement();
			//5.Exceute & process result
			int result = st.executeUpdate(qry);
			//6.excetion handling done
			//7. business logic
			if (result != 0)
			{
				System.out.println("Record Inserted");
				
			}
			else
			{
				System.out.println("Record not inserted");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
