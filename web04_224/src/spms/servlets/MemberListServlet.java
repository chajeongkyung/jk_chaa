package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어노테이션
@WebServlet("/member/list") // WebServlet -> 맵핑기술
//이런 방법도 있따
//@WebServlet(
//      urlPatterns =  {"/member/list"},
//      initParams = {
//         @WebInitParam(name="driver", 
//               value="oracle.jdbc.driver.OracleDriver"),
//         @WebInitParam(name="url", 
//               value="jdbc:oracle:thin:@localhost:1521:xe")
//      }
//)
public class MemberListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = null; // 연결
		PreparedStatement pstmt = null; // 상태
		ResultSet rs = null; // 결과

		// 사용할 jdbc 드라이버:드라이버 타입:서버주소와 포트:db서비스 아이디

		ServletContext sc = this.getServletContext();

		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user = sc.getInitParameter("user");
		String password = sc.getInitParameter("password");

		try {
			// 클래스 로드
			// 1.jdbc 드라이버 등록
			Class.forName(driver);

			// 2.데이터베이스 연결
			conn = DriverManager.getConnection(url, user, password);

//         3.sql 실행 객체 준비

			String sql = "SELECT MNO, MNAME, EMAIL, CRE_DATE" 
					+ " FROM MEMBER" 
					+ " ORDER BY MNO ASC";

			pstmt = conn.prepareStatement(sql);
			// sql 실행문
			// 4.결과 가져오기
			rs = pstmt.executeQuery(sql);

			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");

			PrintWriter out = response.getWriter();

			String htmlStr = "";

			htmlStr += "<html>";
			htmlStr += "<head>";
			htmlStr += "<title>회원목록</title>";
			htmlStr += "</head>";
			htmlStr += "<body>";
			htmlStr += "<h1>회원목록</h1>";
			htmlStr += "<p>";
			htmlStr += "<a href='./add'>신규회원</a>";
			htmlStr += "</p>";
			
			
			while (rs.next()) {
				
				htmlStr += rs.getInt("MNO") + ",";
				htmlStr += "<a href='./update?mNo=";
				htmlStr	+= rs.getInt("MNO");
				htmlStr	+= "'>";
				
				htmlStr	+= rs.getString("MNAME")+ "</a>";
				htmlStr	+= "," + rs.getString("EMAIL");
				htmlStr	+= "," + rs.getDate("CRE_DATE");
				htmlStr += "<a href='./delete?mNo="+ rs.getInt("MNO") +"'>삭제</a>";
				htmlStr += "<br/>";				
			}
			
			htmlStr += "</body>";
			htmlStr += "</html>";

			out.println(htmlStr);

//         response.sendRedirect("./list");

//         out.println("<a href='add'>신규 회원</a><br/><br/>");

			// 5.출력
			while (rs.next()) {
				out.println(

						rs.getInt("mNo") + ", " + "<a href='./update?mNo=" + rs.getInt("mNo") + "'>"
								+ rs.getString("mname") + ", " + "</a>" + rs.getString("email") + ", "
								+ rs.getDate("cre_date") + "<br/>");
			}
			out.println("</body></html>");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 자원해제

			// 결과셋 해제
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
			}

		} // finally 종료
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}