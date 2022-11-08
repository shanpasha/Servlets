package com.loginCreateiqController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter pw=	resp.getWriter();
	
	String user=req.getParameter("userName");
	pw.print("<h3> login Succesfully</h3>");
	pw.print("<h2 style=color:'red'>"+user+"</h2>");
	pw.print("<p><a href='logout.html'>logout</a></p>");

	
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
