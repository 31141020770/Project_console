package tp.kits3.livedinner.phamthanhtam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.phamthanhtam.dao.TagDao;
import tp.kits3.livedinner.phamthanhtam.vo.Tag;

/**
 * Servlet implementation class Tag
 */
@WebServlet("/tag/*")
public class TagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TagServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * d:\dfsdf\sdfsdf\sdf delimiter value and Coman separate is \ (/ redirect)
	 * String[] elements = new String[] {"mario", "stanford","green"}; String s =
	 * String.join("/", elements); String[] splited = s.split("/");
	 * 
	 * /sa/fsdf?key=123&value=123 query string key=123&value=123
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();

		String[] splitedURI = uri.split("/");
		String last = splitedURI[splitedURI.length - 1];
		TagDao dao = new TagDao();
		/* response.getWriter().append("served at: ").append(splitedURI[last]); */
		if ("list".equals(last)) {
			List<Tag> list = dao.findAll();
			String table = "<table>";
			for (Tag tag : list) {
				int tid = tag.getTagid();
				String tname = tag.getTgname();
				table += "<tr><td>" + tid + "</td><td>" + tname + "</td></tr>";
			}
			table += "</table>";
			response.getWriter().println(table);
		} else if ("insert".equals(last)) {
			Tag tag = new Tag();// field tagid, tgname
			String tgname = request.getParameter("tgname");
			tag.setTgname(tgname);
			dao.save(tag);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
