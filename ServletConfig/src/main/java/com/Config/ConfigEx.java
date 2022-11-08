package com.Config;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ConfigEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void init(ServletConfig config) throws ServletException {
	System.out.println("username"+config.getInitParameter("user"));
	System.out.println("password"+config.getInitParameter("pswd"));
		super.init(config);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	PrintWriter pw= response.getWriter();
	ServletConfig config=getServletConfig();
	String user=config.getInitParameter("user");
	String password=config.getInitParameter("pswd");
	pw.print("<b>Name: "+user+"<b><br>");
	pw.print("<i>Password: "+password+"<i><br>");
	
	
	}

}
