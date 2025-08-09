package com.facebook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Loginsrv
 */
@WebServlet("/Loginsrv")
public class Loginsrv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Loginsrv() {
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
		String dob = request.getParameter("dob");

		//business logic
		if(uname.equals("Priya") && pwd.equals("Priya123")) {
			pw.println("Welcome"+" "+uname+ "<br>");
			pw.println("Ur password"+" "+pwd+ "<br>");
			pw.println("Gender"+" "+Gender+ "<br>");
			pw.println("Qualification: " + qualification+"<br>" );
			pw.println("Date of Birth: " + dob + "<br>");

		}
		else {
			pw.println("Login Fail");
		}
		//close objects
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
