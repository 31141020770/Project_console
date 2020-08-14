package tp.kits3.livedinner.phamthanhtam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import tp.kits3.livedinner.phamthanhtam.vo.Contact;

public class ContactDao {
	DataSource dataSource;
	public ContactDao() {
		try {
			Context ctx = new InitialContext();
			Context envCtx = (Context) ctx.lookup("java:/comp/env");
			this.dataSource = (DataSource) envCtx.lookup("jdbc/mariadb");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Contact> findAll() {
		List<Contact> list = new ArrayList<Contact>();
		try {
			Connection conn = this.dataSource.getConnection();
			String selectAll = "select * from contact";
			PreparedStatement psmtm = conn.prepareStatement(selectAll);
			ResultSet rs = psmtm.executeQuery();

			while (rs.next()) {
				Contact contact = new Contact();
				contact.setCoid(rs.getInt("coid"));
				contact.setConame(rs.getString("coname"));
				contact.setPriphone(rs.getString("priphone"));
				contact.setSubphone(rs.getString("subphone"));
				contact.setEmail(rs.getString("email"));
				contact.setAddress(rs.getString("address"));
				contact.setUnused(rs.getBoolean("unused"));
				contact.setOpening(rs.getString("opening"));
				contact.setWeekday(rs.getString("weekday"));
				contact.setWeekend(rs.getString("weekend"));
				contact.setAboutus(rs.getString("aboutus"));
				contact.setLatitude(rs.getDouble("latitude"));
				contact.setLogitude(rs.getDouble("logitude"));
				list.add(contact);
			}
			try {
				rs.close();
				psmtm.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return list;
	}

	public void save(Contact contact) {
		try {
			Connection conn = this.dataSource.getConnection();
			String add = "insert into contact(coname,priphone,subphone,email,address,unused,opening,weekday,weekend, aboutus,latitude,logitude) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement psmtm = conn.prepareStatement(add);
			psmtm.setString(1, contact.getConame());
			psmtm.setString(2, contact.getPriphone());
			psmtm.setString(3, contact.getSubphone());
			psmtm.setString(4, contact.getEmail());
			psmtm.setString(5, contact.getAddress());
			psmtm.setBoolean(6, contact.getUnused());
			psmtm.setString(7, contact.getOpening());
			psmtm.setString(8, contact.getWeekday());
			psmtm.setString(9, contact.getWeekend());
			psmtm.setString(10, contact.getAboutus());
			psmtm.setDouble(11, contact.getLatitude());
			psmtm.setDouble(12, contact.getLogitude());
			psmtm.executeUpdate();
			try {
				psmtm.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public Contact findOne(int coid) {
		Contact contact = null;
		try {
			Connection conn = this.dataSource.getConnection();
			String select = "select * from contact where coid = ? ";
			PreparedStatement psmtm = conn.prepareStatement(select);
			psmtm.setInt(1, coid);
			ResultSet rs = psmtm.executeQuery();

			if (rs.next()) {
				contact = new Contact();
				contact.setCoid(rs.getInt("coid"));
				contact.setConame(rs.getString("coname"));
				contact.setPriphone(rs.getString("priphone"));
				contact.setSubphone(rs.getString("subphone"));
				contact.setEmail(rs.getString("email"));
				contact.setAddress(rs.getString("address"));
				contact.setUnused(rs.getBoolean("unused"));
				contact.setOpening(rs.getString("opening"));
				contact.setWeekday(rs.getString("weekday"));
				contact.setWeekend(rs.getString("weekend"));
				contact.setAboutus(rs.getString("aboutus"));
				contact.setLatitude(rs.getDouble("latitude"));
				contact.setLogitude(rs.getDouble("logitude"));
			}
			try {
				rs.close();
				psmtm.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return contact;
	}

	public void update(Contact contact) {
		try {
			Connection conn = this.dataSource.getConnection();
			String update = "update contact set coname = ?, priphone=?, subphone=?,email= ?,address= ?,unused= ?,opening= ?,weekday= ?,weekend= ?,aboutus= ?,latitude= ?, logitude=?  where coid = ? ";
			PreparedStatement psmtm = conn.prepareStatement(update);
			psmtm.setString(1, contact.getConame());
			psmtm.setString(2, contact.getPriphone());
			psmtm.setString(3, contact.getSubphone());
			psmtm.setString(4, contact.getEmail());
			psmtm.setString(5, contact.getAddress());
			psmtm.setBoolean(6, contact.getUnused());
			psmtm.setString(7, contact.getOpening());
			psmtm.setString(8, contact.getWeekday());
			psmtm.setString(9, contact.getWeekend());
			psmtm.setString(10, contact.getAboutus());
			psmtm.setDouble(11, contact.getLatitude());
			psmtm.setDouble(12, contact.getLogitude());
			psmtm.setInt(13, contact.getCoid());
			psmtm.executeUpdate();
			try {
				psmtm.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}