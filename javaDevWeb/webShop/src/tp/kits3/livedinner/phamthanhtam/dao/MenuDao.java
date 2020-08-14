package tp.kits3.livedinner.phamthanhtam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import tp.kits3.livedinner.phamthanhtam.vo.Menu;

public class MenuDao {
	private DataSource dataSource;
	public MenuDao() {
		try {
			Context ctx = new InitialContext();
			this.dataSource = (DataSource)((Context)ctx.lookup("java:/comp/env")).lookup("jdbc/mariadb");
		} catch (Exception e) {
			
		}
	}
	public List<Menu> findAll() {
		List<Menu> list = new ArrayList<Menu>();
		try {
			Connection conn = this.dataSource.getConnection();
			String selectAll = "select * from menu";
			PreparedStatement psmtm = conn.prepareStatement(selectAll);
			ResultSet rs = psmtm.executeQuery();
			while (rs.next()) {
				Menu menu = new Menu();
				menu.setMuid(rs.getInt("muid"));
				menu.setCtgid(rs.getInt("ctgid"));
				menu.setMuname(rs.getString("muname"));
				menu.setIntro(rs.getNString("intro"));
				menu.setDetails(rs.getNString("details"));
				menu.setPrice(rs.getDouble("price"));
				menu.setCurrency(rs.getString("currency"));
				list.add(menu);
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

}
