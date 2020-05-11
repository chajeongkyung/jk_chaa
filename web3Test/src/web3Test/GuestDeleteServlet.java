package web3Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuestDeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 데이터베이스 관련 객체 변수 선언
		Connection conn = null;// 연결 db그자체
		PreparedStatement pstmt = null;// 상태 문장그자체
		ResultSet rs = null;// 결과 이어주는그자체

		// 사용할 jdbc 드라이버:드라이버 타이비서버주소와 포트:db서비스 아이디
		// (localhost=127.0.0.1 자기자신 IPv4)

		ServletContext sc = this.getServletContext();
		
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user = sc.getInitParameter("user");
		String password = sc.getInitParameter("password");		
		
		int mNo = Integer.parseInt(request.getParameter("mNo"));

		try {

			Class.forName(driver);

			conn = DriverManager.getConnection(url, user, password);

			// 데이터베이스는 대문자로 한다
			String sql = "DELETE FROM GUEST" 
					+ " WHERE MNO = ?";

			// sql실행문
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, mNo);

			pstmt.executeQuery();
			
			response.sendRedirect("./list");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6. 자원해제(오류가 있던 없던 해제, 메모리누수방지)

			// 결과셋 해제(해제도 작은 거 먼저)
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			// 상태 해제
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			// 연결 해제
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}//if 종료
		}//finally 종료

	}//doGet 종료

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
	}
}
