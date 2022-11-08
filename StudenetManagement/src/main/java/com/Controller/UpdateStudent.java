package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Student;
import com.StudentDao.StudentDaoImpl;

public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int roll=Integer.parseInt(request.getParameter("roll"));
		String name=request.getParameter("name");
		String location=request.getParameter("location");
		String course=request.getParameter("course");
		
		Student s=new Student(name, roll, course, location);
		StudentDaoImpl ss=new StudentDaoImpl();
		ss.update_Id(s);
		pw.print("<a href ='loginPage.html'>Home</a>||");
		pw.print("<h1>Sucessfully Updated...</h1>");
		
		
		

				
				
		
		
		
	}

}
