package spms.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class AppInitServlet extends HttpServlet{

	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("AppInitServlet 준비...");

		String driver = "";
		String url = "";
		String user = "";
		String password = "";
		
		Connection conn = null;
		
		try {
			//전역의 getServletContext를 받는다
			ServletContext sc = this.getServletContext();

			driver = sc.getInitParameter("driver");

			Class.forName(driver);

			url = sc.getInitParameter("url");
			user = sc.getInitParameter("user");
			password = sc.getInitParameter("password");	
			
			// 2.데이터베이스 연결
			conn = DriverManager.getConnection(url, user, password);
			
			//map방식 (키,값)
			sc.setAttribute("conn", conn);
			
			System.out.println("DB 연결 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}//init 종료
	
	@Override
	public void destroy() {
		// destroy()는 마지막에 항상 실행 -> 마지막으로db연결해제
		System.out.println("AppInitServlet 마무리...");
		super.destroy();
		
		ServletContext sc = this.getServletContext();
		
		Connection conn = (Connection)sc.getAttribute("conn");
		
		try {
			if (conn != null) {
				conn.close();
				System.out.println("DB연결 해제");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
