package BasicWebPages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServlets extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		
		PrintWriter ps=res.getWriter();
		
		ps.print("<html>");
		ps.print("<body>");
		ps.print("<h1>Welcome Generic Sevlets </h1>");
		ps.print("</body>");
		ps.print("</html>");
		ps.flush();
		ps.close();
		
	}

}
