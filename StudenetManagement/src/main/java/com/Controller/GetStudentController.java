package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Student;
import com.Service.StudentServiceImpl;
import com.StudentDao.StudentDaoImpl;

public class GetStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 StudentServiceImpl stuu=new StudentServiceImpl();
		
	List<Student> stu=stuu.getStudents();
	PrintWriter pw=	response.getWriter();
	response.setContentType("text/html");
	
	pw.print("<html>");
	pw.print("<table border='10px'>");
	pw.print("<tr><th>RollNumber</th> <th>Name</th>   <th>Course</th> <th>Location</th>   ");
	
	for (Student student : stu) {
		pw.print("<tr>");
		pw.print("<td>"+student.getRoll()+"</td>");
		pw.print("<td>"+student.getName()+"</td>");
		pw.print("<td>"+student.getCourse()+"</td>");
		pw.print("<td>"+student.getLocation()+"</td></tr>");
		
	}
	pw.print("</table>");
	pw.print("<a href ='loginPage.html'>Home</a>");
	pw.print("</html>");
	
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
