package tp.kits3.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/hai")
public class SecondServlet extends GenericServlet {

	/**
	 * sersion of this class (servlet)
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// how to response 
		// 1. set Content-type
		res.setContentType("text/html;charset=UTF-8");
		// 2. open outputStream to client
		PrintWriter writer = res.getWriter(); // out data is text
		// 3. send HTML data
		writer.println("<html><head><title>SecondDemo</title></head>");
		writer.println("<body>");
		writer.println("<h1> Second Servlet by response object </h1>");
		writer.println("</body></html>");
	}

}
