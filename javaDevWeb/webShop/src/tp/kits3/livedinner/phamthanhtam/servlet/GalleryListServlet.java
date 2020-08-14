package tp.kits3.livedinner.phamthanhtam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/gallery/list")
public class GalleryListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GalleryListServlet() {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String prefix = "/WEB-INF/views/";
		String postfix = ".jsp";
		request.getRequestDispatcher(prefix+"gallery"+ postfix).forward(request, response);;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
