package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Service.StudentServiceImpl;
import com.google.protobuf.Service;

/**
 * Servlet implementation class DeleteStudent
 */
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentServiceImpl s=new StudentServiceImpl();
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
	int id=Integer.parseInt(request.getParameter("id"));
	pw.println("<h1>"+id+"</h1>");
	
	s.delete(id);
	pw.print("<h1>Deleted Sucessfully...</h1>");
	pw.print("<a href ='loginPage.html'>Home</a>");
	
	
		
		
		
		
		
		
		
		
	}

}
