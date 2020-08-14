package tp.kits3.livedinner.phamthanhtam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.phamthanhtam.dao.CategoryDao;
import tp.kits3.livedinner.phamthanhtam.vo.Category;

/**
 * Servlet implementation class Category
 */
@WebServlet("/category/list")
public class CategoryListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryDao dao = new CategoryDao();
		List<Category> list = dao.findAll();
		if (list.size() == 0) {
			System.out.println("have no entries");
		}
		String divList = "<div class='ctgList'>";
		for (Category ct : list) {
			divList +="<p><a href='update?ctgid="+ct.getCtgid()+"'>" + ct.toString() + "</p>";
		}
		divList += "</div>";
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(divList);
		
	}
}
