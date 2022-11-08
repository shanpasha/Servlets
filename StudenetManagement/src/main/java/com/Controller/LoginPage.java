package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.security.util.Password;

public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw=	response.getWriter();
		response.setContentType("text/html");
		String user=request.getParameter("userName");
	String	Password=request.getParameter("password");
		
		if(user.equals("shan")&&Password.equals("shannu")) {
			
			request.getRequestDispatcher("loginPage.html").forward(request, response);
		}else {
			
			request.getRequestDispatcher("index.jsp").include(request, response);
			pw.print("<h3 style='color:red;'>Please enter Valid username or password</h3>");
		}
		

		
		
	}

}
