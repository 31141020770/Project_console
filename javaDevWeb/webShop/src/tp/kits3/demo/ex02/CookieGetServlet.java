package tp.kits3.demo.ex02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieGetServlet
 */
@WebServlet("/cookie/get")
public class CookieGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cks = request.getCookies();
		for (int i = 0; i < cks.length; i++) {
			Cookie cookie = cks[i];
			System.out.println(cookie.getName() + ":" + cookie.getValue());;
		}
	}

}
