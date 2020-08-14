package tp.kits3.demo.ex01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TagSerblet
 */
@WebServlet("/ta")
public abstract class TagSerblet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
     * what core concept of Java OOP 
     * 1. re-use( one sourse - mutil use)
     * 2. easy to maintaince(repair, update, upgrade) 
     */
	private Connection conn;
    public TagSerblet() {
        super();
        initConnection();
    }
    private void initConnection() {
    	try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/livedinner","root","lemlan");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    @Override
   	public void destroy() {
   		super.destroy();
   		try {
   			this.conn.close();
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Statement stmt =null;
		ResultSet rs = null;
		try {
			
			stmt = conn.createStatement();
			String sql =" select * from tag";
			rs = stmt.executeQuery(sql);
			/* boolean rs =stmt.execute(sql); */
			while (rs.next()) {
				/*
				 * int tid = rs.getInt(1); String tname = rs.getString(2);
				 * System.out.println(tid + ": " + tname);
				 */
				resolver(rs);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			try {
				rs.close();
				stmt.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	protected abstract void resolver(ResultSet rs);
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
