package tp.kits3.demo.ex02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionSetSerlvet
 */
@WebServlet("/session/set")
public class SessionSetSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//if this session is null, create session
		// else has session, current session
		if (session.isNew()) {
			System.out.println("create session");
		}
		String id = session.getId();
		System.out.println(id);
		session.setAttribute("loginUser", "mario");
		session.setAttribute("loginRole", "admin");
		response.getWriter().append("cc");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
