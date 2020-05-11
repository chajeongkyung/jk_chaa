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

public class GuestUpdateServlet extends HttpServlet {

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
			String sql = "SELECT MNO, EMAIL, MNAME, CRE_DATE " 
					+ "FROM GUEST " 
					+ "WHERE MNO = ?";

			// sql실행문
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, mNo);

			rs = pstmt.executeQuery();

			String mName = "";
			String email = "";
			Date creDate = null;

			if (rs.next()) {
				mName = rs.getString("MNAME");
				email = rs.getString("EMAIL");
				creDate = rs.getDate("CRE_DATE");
			}

			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");

			PrintWriter out = response.getWriter();
			String htmlStr = "";

			htmlStr += "<!DOCTYPE html>";
			htmlStr += "<html>";
			htmlStr += "<head>";
			htmlStr += "<meta charset='UTF-8'>";
			htmlStr += "<title>회원정보</title>";
			htmlStr += "</head>";
			htmlStr += "<body>";
			htmlStr += "<h1>회원정보</h1>	";
			htmlStr += "<form action='/web3Test/guest/update' method='post'>";
			htmlStr += "번호: <input type='text' name='mNo' " + "value='" + mNo + "'readonly='readonly'><br>";
			htmlStr += "이름: <input type='text' name='name' value='" + mName + "'><br>";
			htmlStr += "이메일: <input type='text' name='email' value='" + email + "'><br>";
			htmlStr += "가입일: " + creDate + "<br>";
			htmlStr += "<input type='submit' value='저장'>";
			htmlStr += "<input type='button' value='삭제' onclick='location.href=\"./delete?mNo="+rs.getInt("MNO")+"\"'>";
			htmlStr += "<input type='button' value='취소' onclick='location.href=\"./list\"'>";
			htmlStr += "</form>	";
			htmlStr += "</body>";
			htmlStr += "</html>";

			out.println(htmlStr);

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
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		ServletContext sc = this.getServletContext();
		
		//주소가 보이면 안된다!!
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user = sc.getInitParameter("user");
		String password = sc.getInitParameter("password");		
		
		String email = req.getParameter("email");		
		String name = req.getParameter("name");		
		int mNo = Integer.parseInt(req.getParameter("mNo"));
		String sql = "";
		
		try {
			Class.forName(driver);
			
			System.out.println("오라클 드라이버 로드");
			conn = DriverManager.getConnection(url, user, password);
		
			sql += "update guest";
			sql += " set email = ?, "
					+ "mname =?, mod_date=sysdate";
			sql += " where mno = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, email);
			pstmt.setString(2, name);
			pstmt.setInt(3, mNo);

			pstmt.executeUpdate();
			
			resp.sendRedirect("./list");
			
			//화면만드는부분
//			resp.setContentType("text/html");
//			resp.setCharacterEncoding("UTF-8");
//			
//			PrintWriter out = resp.getWriter();
//			
//			String htmlStr = "";
//			
//			htmlStr += "<html><head><title>회원정보수정결과</title></head>";
//			htmlStr += "</head>";
//			
//			htmlStr += "<body>";
//			htmlStr += "<p>수정 성공입니다.!</p>";
//			htmlStr += "</body></html>";
//					
//			out.println(htmlStr);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}  finally {
				//자원해제
				//상태해제
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				//연결해제
				if (conn != null) {
					try {
						conn.close();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}//if 종료
		}//finally 종료
		
	}
}
