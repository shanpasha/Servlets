package BasicWebPages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Welcome implements Servlet {

	@Override
	public void destroy() {
	System.out.println("servlets Destroyed");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
	System.out.println("Intialized Servlets");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		res.setContentType("text/html");
		
		PrintWriter ps=res.getWriter();
		
		ps.print("<html>");
		ps.print("<body>");
		ps.print("<h1>Welcome Sevlet Interface</h1>");
		ps.print("</body>");
		ps.print("</html>");
		ps.flush();
		ps.close();
		
	
		
		
		
	}
	
	

}
