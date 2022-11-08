package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerWithPost
 */
public class ControllerWithPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	
		
		PrintWriter pw=	response.getWriter();

		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		double salary =Double.parseDouble(request.getParameter("salary"));
		
		pw.print(id+" "+name+" "+salary);
		pw.println("sucessfully saved...");
		pw.close();
	}

}
