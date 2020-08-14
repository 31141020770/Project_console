package tp.kits3.demo.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuguServlet
 */
@WebServlet("/gugudan")
public class GuguServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuguServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String dan = request.getParameter("dan");
		int idan = Integer.parseInt(dan);
		String html ="<table>";
		for (int i = 0; i < 10; ++i) {
			int result = idan * i;
			html +="<tr>";
			html +="<td>" +idan+"</td><td>" + " x " + i + "</td><td>" + result + "</td>";
			html +="</tr>";
		}
		html += "</table>";
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append(html);
		response.getWriter().println(html);
	}
}
