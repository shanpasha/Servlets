package com.SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		
		String user=request.getParameter("userName");
		String pas=request.getParameter("password");
		HttpSession session=request.getSession();
		session.setAttribute("user", user);
		
		if(pas.equals("shannu")) {
			
			pw.print("<i>Login Sucessfully...<i>");
			request.getRequestDispatcher("welcome").forward(request, response);
			
		}else {
			
		
			
			request.getRequestDispatcher("incorrectps.html").include(request, response);
			
		}
		
	
		
		
		
		
		doGet(request, response);
	}

}
