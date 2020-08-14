package tp.kits3.livedinner.phamthanhtam.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.phamthanhtam.dao.CategoryDao;
import tp.kits3.livedinner.phamthanhtam.vo.Category;

@WebServlet("/category/update")
public class CategoryUpdateServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CategoryDao dao;
	public CategoryUpdateServlet() {
		this.dao = new CategoryDao();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// show form to insert submit
		int ctgid = Integer.parseInt(request.getParameter("ctgid"));
		Category category = dao.findOne(ctgid);
		if (category == null) {
			System.out.println("don't have data");
		}else {
			String form = "<div>";
			form += "<form method ='post' action='update'>";
			form += "Category.name <input type='text' name='ctgid' value='"+category.getCtgid()+"' readonly/> </br>";
			form += "Category.name <input type='text' name='ctgname' value='"+category.getCtname() +"' required />";
			form += "Category.service <input type='text' name='service' value='"+category.getService() +"' required />";
			form += "<input type='submit' value='update'/>";
			form += "</form></div>";
			response.getWriter().append(form);
		}	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Category category = new Category();
		category.setCtgid(Integer.parseInt(request.getParameter("ctgid")));
		category.setCtname(request.getParameter("ctgname"));
		category.setService(request.getParameter("service"));
		dao.update(category);
		/* response.sendRedirect("/webShop/category/list"); */
		RequestDispatcher rs= request.getRequestDispatcher("list");
		rs.forward(request, response);  
	}

}
