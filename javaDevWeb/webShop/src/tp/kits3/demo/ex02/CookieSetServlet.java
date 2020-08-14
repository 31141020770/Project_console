package tp.kits3.demo.ex02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieSetServlet
 */
@WebServlet("/cookie/set")
public class CookieSetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ck = new Cookie("testCookie", "cookie'svalue");
		//config cookie
		ck.setMaxAge(15);
		response.addCookie(ck);
		response.getWriter().append("ccc");
	}

}

