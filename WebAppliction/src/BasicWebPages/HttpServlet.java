package BasicWebPages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet extends javax.servlet.http.HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
resp.setContentType("text/html");
		
		PrintWriter ps=resp.getWriter();
		
		ps.print("<html>");
		ps.print("<body>");
		ps.print("<h1>Welcome HTTP Sevlets </h1>");
		ps.print("</body>");
		ps.print("</html>");
		ps.flush();
		ps.close();
		
		
	}
	

}
