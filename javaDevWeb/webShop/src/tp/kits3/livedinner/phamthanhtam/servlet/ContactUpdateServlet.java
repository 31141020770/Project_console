package tp.kits3.livedinner.phamthanhtam.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/contact/update")
public class ContactUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ContactDao dao;
	public ContactUpdateServlet() {
		this.dao = new ContactDao();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int coid = Integer.parseInt(request.getParameter("coid"));
		Contact contact = dao.findOne(coid);
		String form = "<div>";
		form += "<form method ='post' action='update'>";
		form += "contact.coid <input type='text' name='coid' value='"+contact.getCoid() +"' readonly /></br>";
		form += "contact.name <input type='text' name='coname' required /></br>";
		form += "contact.priphone <input type='text' name='priphone' required /></br>";
		form += "contact.subphone <input type='text' name='subphone' required /></br>";
		form += "contact.email <input type='text' name='email' required /></br>";
		form += "contact.address <input type='text' name='address' required /></br>";
		form += "contact.unused <input type='text' name='unused' required /></br>";
		form += "contact.opening <input type='text' name='opening' required /></br>";
		form += "contact.weekday <input type='text' name='weekday' required /></br>";
		form += "contact.weekend <input type='text' name='weekend' required /></br>";
		form += "contact.aboutus <input type='text' name='aboutus' required /></br>";
		form += "contact.latitude <input type='text' name='latitude' required /></br>";
		form += "contact.logitude <input type='text' name='logitude' required /></br>";	
		form += "<input type='submit' value='update'/>";
		form += "</form></div>";
		response.getWriter().append(form);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contact contact = new Contact();
		contact.setCoid(Integer.parseInt(request.getParameter("coid")));
		contact.setConame(request.getParameter("coname"));
		contact.setPriphone(request.getParameter("priphone"));
		contact.setSubphone(request.getParameter("subphone"));
		contact.setEmail(request.getParameter("email"));
		contact.setAddress(request.getParameter("address"));
		contact.setUnused(Boolean.parseBoolean(request.getParameter("unused")));
		contact.setOpening(request.getParameter("opening"));		
		contact.setWeekday(request.getParameter("weekday"));
		contact.setWeekend(request.getParameter("weekend"));
		contact.setAboutus(request.getParameter("aboutus"));
		contact.setLatitude(Double.parseDouble(request.getParameter("latitude")));
		contact.setLogitude(Double.parseDouble(request.getParameter("logitude")));
		dao.update(contact);
		RequestDispatcher rd = request.getRequestDispatcher("update/list");
		rd.forward(request, response);
	}

}
