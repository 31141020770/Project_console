package tp.kits3.livedinner.phamthanhtam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Java Namming DI( JNDI)
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import tp.kits3.livedinner.phamthanhtam.vo.Category;

public class CategoryDao {
	DataSource datasource;

	public CategoryDao() {
		try {
			Context ctx = new InitialContext();
			// get info of Tomcat
			Context envCtx = (Context) ctx.lookup("java:/comp/env");// search servlet container
			// get info in context.xml
			this.datasource = (DataSource) envCtx.lookup("jdbc/mariadb");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Category> findAll() {
		List<Category> list = new ArrayList<Category>();
		try {
			Connection conn = this.datasource.getConnection();
			String selectAll = "select * from category";
			PreparedStatement psmtm = conn.prepareStatement(selectAll);
			ResultSet rs = psmtm.executeQuery();

			while (rs.next()) {
				Category category = new Category();
				category.setCtgid(rs.getInt("ctgid"));
				category.setCtname(rs.getString("ctname"));
				category.setService(rs.getString("service"));
				list.add(category);
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

		return list;
	}

	public void save(Category category) {
		try {
			Connection conn = this.datasource.getConnection();
			String add = "insert into category(ctname , service) values(?,?)";
			PreparedStatement psmtm = conn.prepareStatement(add);
			psmtm.setString(1, category.getCtname());
			psmtm.setString(2, category.getService());
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

	public Category findOne(int ctgid) {
		Category category = null;
		try {
			Connection conn = this.datasource.getConnection();
			String select = "select * from category where ctgid = ? ";
			PreparedStatement psmtm = conn.prepareStatement(select);
			psmtm.setInt(1, ctgid);
			ResultSet rs = psmtm.executeQuery();

			if (rs.next()) {
				category = new Category();
				category.setCtgid(ctgid);
				category.setCtname(rs.getString("ctname"));
				category.setService(rs.getString("service"));
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

		return category;
	}

	public void update(Category category) {
		try {
			Connection conn = this.datasource.getConnection();
			String update = "update category set ctname = ?, service=? where ctgid = ? ";
			PreparedStatement psmtm = conn.prepareStatement(update);
			psmtm.setString(1, category.getCtname());
			psmtm.setString(2, category.getService());
			psmtm.setInt(3, category.getCtgid());
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
