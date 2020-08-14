package tp.kits3.livedinner.phamthanhtam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.phamthanhtam.dao.CategoryDao;
import tp.kits3.livedinner.phamthanhtam.vo.Category;

/**
 * Servlet implementation class CategoryAddServlet
 */
@WebServlet("/category/add")
public class CategoryAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CategoryDao dao;
	public CategoryAddServlet() {
		this.dao = new CategoryDao();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// show form to insert submit
		String form = "<div>";
		form += "<form method ='post' action='add'>";
		form += "Category.name <input type='text' name='ctgname' required />";
		form += "Category.service <input type='text' name='service' required />";
		form += "<input type='submit' value='add'/>";
		form += "</form></div>";
		response.getWriter().append(form);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// save to database
		Category category = new Category();
		category.setCtname(request.getParameter("ctgname"));
		if (request.getParameter("service").length() == 1) {
			category.setService(request.getParameter("service"));
			dao.save(category);
		} else {
			System.out.println("not vailid data : must be 1 char");
		}

	}

}
