package tp.kits3.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/first")
public class FirstServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//webapplication(Context)
//		ServletContext ctx =getServletContext();
//		ctx.setAttribute("pm", "william stanford mario greee");
		request.setAttribute("pm", "william");
		request.getRequestDispatcher("/second2").forward(request, response);
		response.getWriter().append("First Servlet");
		
	}
	
}
