package com.Contex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class contexEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		ServletContext config=getServletContext();
		String Name=config.getInitParameter("Name");
		String City=config.getInitParameter("City");
		pw.print("<b>userName: "+Name+"<b><br>");
		pw.print("<i>Password: "+City+"<i><br>");
		
		
		
		
	}
}
