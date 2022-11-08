package com.loginCreateiqController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String userName=request.getParameter("userName");
		String passowrd=request.getParameter("password");
		if(userName.equals("shan")&&passowrd.equals("shannu")) {
			
			request.getRequestDispatcher("Welcome").forward(request, response);
		}else {
			
			pw.println("<h2>incorrect username Or passowrd please try again...!<h2>");
			pw.print("<img src='C:\\Users\\new\\Downloads\\pass.jpg' >");
			request.getRequestDispatcher("logout.html").include(request, response);
			
			pw.flush();
		}
		pw.close();
		
		

	}
	
	
}
