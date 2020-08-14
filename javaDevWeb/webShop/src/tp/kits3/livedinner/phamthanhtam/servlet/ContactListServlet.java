package tp.kits3.livedinner.phamthanhtam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.kits3.livedinner.phamthanhtam.dao.ContactDao;
import tp.kits3.livedinner.phamthanhtam.vo.Contact;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/contact/list")
public class ContactListServlet extends HttpServlet {
	private ContactDao dao;
	public ContactListServlet() {
		this.dao = new ContactDao();
	}
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Contact> listContact = dao.findAll();
//		if (listContact.size() == 0) {
//			System.out.println("have no entries");
//		}
//		String divList = "<div class='coList'>";
//		for (Contact ct : listContact) {
//			divList +="<p><a href='update?coid="+ct.getCoid()+"'>" + ct.toString() + "</p>";
//		}
//		divList += "</div>";
//		response.setContentType("text/html;charset=UTF-8");
//		response.getWriter().append(divList);
		response.setContentType("text/html; charset=UTF-8");
		request.setAttribute("MenuList", listContact);
		
		String prefix = "/WEB-INF/views/";
		String postfix = ".jsp";
		request.getRequestDispatcher(prefix+"contact"+ postfix).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
