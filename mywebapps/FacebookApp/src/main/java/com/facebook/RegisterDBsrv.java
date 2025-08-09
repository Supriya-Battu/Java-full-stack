package com.facebook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class RegisterDBsrv
 */
@WebServlet("/RegisterDBsrv")
public class RegisterDBsrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterDBsrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//general settings
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		//request data gathering logic
		String uname= request.getParameter("username");
		String pwd = request.getParameter("password");
		String Gender = request.getParameter("Gender");
		String qualification = request.getParameter("qualification");
		String dob = request.getParameter("dob");//java.sql.Date.valueOf()
		//Persistence logic
		//global objects
		Connection con = null;
		PreparedStatement ps = null;
		try {
			//1. load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.establish connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook");
			//3.Prepare query
			String qry = "insert into users values(?,?,?,?,?)";
			//4.statement object(vehicle)
			ps = con.prepareStatement(qry);
			//set values
			ps.setString(1, uname);
			ps.setString(2, pwd);
			ps.setString(3, Gender);
			ps.setString(4, qualification);
			ps.setString(5, dob);
			//5.execute &process results
			int res = ps.executeUpdate();
			//6.business logic
			if(res!=0) {
			pw.println("Thank you for registering");
			}
			else {
				pw.println("Somrthing went wrong!!!");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
