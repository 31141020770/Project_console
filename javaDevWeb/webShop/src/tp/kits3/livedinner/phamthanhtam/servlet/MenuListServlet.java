package tp.kits3.livedinner.phamthanhtam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.phamthanhtam.dao.MenuDao;
import tp.kits3.livedinner.phamthanhtam.vo.Menu;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/menu/list")
public class MenuListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MenuDao dao;
	public MenuListServlet() {
			this.dao = new MenuDao();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*------------- 				json 				------------*/
//		Menu menu = new Menu();
//		menu.setMuid(1);
//		menu.setCtgid(1);
//		Gson gson = new Gson();
//		String json = gson.toJson(menu);
//		Menu menu2 = gson.fromJson(json, Menu.class);
		
/*-------	 	ServletContext is share attribute together between Servlets	
 * 				data be to share  data to all other Servlets like login state (session)
 * 				be used but dont resolve many data type like dispatcher
 * 				
 * 		-------- */
//		ServletContext ctx = getServletContext();
//		ctx.setAttribute("menu", new Menu());
		
		
		response.setContentType("text/html; charset=UTF-8");
		List<Menu> menulist = dao.findAll();
		request.setAttribute("MenuList", menulist);
		
		String prefix = "/WEB-INF/views/";
		String postfix = ".jsp";
		request.getRequestDispatcher(prefix+"menuList"+ postfix).forward(request, response);;
		
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/category/list");
//		request.setAttribute("menuName", new Menu());
//		requestDispatcher.forward(request, response);
//		response.getWriter().append("");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
