package tp.kits3.livedinner.phamthanhtam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post
 */
@WebServlet("/post/list")
public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prefix = "/WEB-INF/views/";
		String postfix = ".jsp";
		request.getRequestDispatcher(prefix+"blog"+ postfix).forward(request, response);
	}


}
