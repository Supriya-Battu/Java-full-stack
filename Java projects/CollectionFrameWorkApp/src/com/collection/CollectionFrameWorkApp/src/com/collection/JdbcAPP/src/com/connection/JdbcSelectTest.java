package com.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

		public class JdbcSelectTest {


			public static void main(String[] args) {
				//global object
				Connection con = null;
				Statement st =null; 
				ResultSet rs = null;
				try {
					//1. load driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					//2.Establish Connection
					con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/amazon",
							"root",
							"root");
					//3.Prepare query
					String qry = "select * from  product";
					//4.Create statement (vehicle)
					st = con.createStatement();
					//5.Exceute & process result
					 rs = st.executeQuery(qry);
					
					//6.excetion handling done
					while (rs.next())
					{
						System.out.println(rs.getInt(1)+" "+
					rs.getString(2)+" "+
								rs.getInt(3));
					}
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally
				{
					try {
						rs.close();
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
