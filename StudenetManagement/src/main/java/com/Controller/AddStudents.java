package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Student;
import com.Service.StudentServiceImpl;
import com.StudentDao.StudentDaoImpl;


public class AddStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	PrintWriter pw=resp.getWriter();
    	resp.setContentType("text/html");
    	
    	StudentServiceImpl s=new StudentServiceImpl();
   int roll=Integer.parseInt(req.getParameter("id"));
   String name=req.getParameter("name");
   String course=req.getParameter("course");
   String location=req.getParameter("location");
   Student student=new Student(name, roll, course, location);
   s.add(student);
   pw.print("<a href ='loginPage.html'>Home</a>||");
	pw.print("<a href ='addStudents'>Add Another Student Here</a>");
   pw.print("<h2> Student Added Sucessfully...!</h2>");
  
	   
	  // pw.print(roll+" "+name+" "+course+" "+location);
	   
  
   
    	


    
    }
    
}
