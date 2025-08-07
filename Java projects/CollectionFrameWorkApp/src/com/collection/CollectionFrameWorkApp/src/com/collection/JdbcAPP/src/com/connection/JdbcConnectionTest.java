package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JdbcConnectionTest {
	public static void main(String[] args)
	{
		//global objects
		Connection con = null;
		try {
			//1.Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.establish connection
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/amazon",
					"root",
					"root");
			//3.business logic
			if(con!= null)
			{
				System.out.println("Connection success");
			}
			else
			{
				System.out.println("Connection fail");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//finally
	}//main
}//class