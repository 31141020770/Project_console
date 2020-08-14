package tp.kits3.livedinner.phamthanhtam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tp.kits3.livedinner.phamthanhtam.vo.Tag;

public class TagDao {
	final String driver = "org.mariadb.jdbc.Driver";
	final String url = "jdbc:mariadb://localhost:3306/livedinner";
	final String id = "root";
	final String pass = "lemlan";
	private Connection conn;

	protected void connectDB() {
		try {
			Class.forName(driver);
			this.conn = DriverManager.getConnection(url, id, pass);

		} catch (Exception e) {
			String message = "";
			message += TagDao.class.getSimpleName();
			message += " : connectDB()";
			System.out.println(message);
		}

	}

	public List<Tag> findAll() {
		connectDB();
		Statement stmt = null;
		ResultSet rs = null;
		List<Tag> list = new ArrayList<Tag>();
		String sql_selectAll = "select * from tag";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql_selectAll);
			
			while (rs.next()) {
				Tag tag = new Tag();
				tag.setTagid(rs.getInt("tagid"));
				tag.setTgname(rs.getString("tgname"));
				list.add(tag);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}
	// Connection here
	// CRUD here
	// request to DB
	// return to Servlet

	public void save(Tag tag) {
		connectDB();
		Statement stmt = null;
		String sql_insert = "INSERT INTO tag (tgname) values ('" + tag.getTgname() + "')";
		try {
			stmt = conn.createStatement();
			stmt.execute(sql_insert);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
		
	}
	public void update(Tag tag) {
		if(tag.getTagid() <= 0 || tag.getTagid() == null ) {
			save(tag);
			return;
		}
		connectDB();
		Statement stmt = null;
		String sql_insert = "update tag set tgname = '" + tag.getTgname() + "'" + " where tagid = '" +tag.getTagid()+ "'";
		try {
			stmt = conn.createStatement();
			stmt.execute(sql_insert);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
		
	}

}
