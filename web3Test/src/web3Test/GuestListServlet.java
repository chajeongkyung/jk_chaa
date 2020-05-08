package web3Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GuestListServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 데이터베이스 관련 객체 변수 선언
		Connection conn = null;// 연결 db그자체
		Statement stmt = null;// 상태 문장그자체
		ResultSet rs = null;// 결과 이어주는그자체

		// 사용할 jdbc 드라이버:드라이버 타이비서버주소와 포트:db서비스 아이디
		// (localhost=127.0.0.1 자기자신 IPv4)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jsp";
		String password = "jsp12";

		try {
			// 클래스 로드
			// 1. jdbc 드라이버 등록(하기위해 알집파일을 붙여넣었음, 해당경로에 진짜 파일이 있음!)
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터베이스 연결
			conn = DriverManager.getConnection(url, user, password);

			// 3. sql 실행 객체 준비
			stmt = conn.createStatement();

			String sql = "SELECT MNO, MNAME, EMAIL, CRE_DATE, MOD_DATE, USER_ID, SAL" 
					+ " FROM GUEST"
					+ " ORDER BY MNO ASC";

			// sql 실행문
			// 4. 결과 가져오기
			rs = stmt.executeQuery(sql);

			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");

			PrintWriter out = response.getWriter();

			// 추가
			// out.println("<a href='add'>신규 회원</a><br>");
			String htmlStr = "";

			htmlStr += "<p>";
			htmlStr += "<a href='./add'>신규 회원";
			htmlStr += "</a>";
			htmlStr += "</p>";

			out.println("<html><head><title>게스트목록</title></head>");
			out.println("<body><h1>게스트목록</h1>");

			out.println(htmlStr);
			
//			int mNo = rs.getInt("mNo");
			
			// 5. 출력
			while (rs.next()) {
				out.println(
						// number는 getInt, varchar는 getString
						rs.getInt("mno") + ", <a href='./update?mNo="+rs.getInt("mNo")+"'>" 
								+ rs.getString("mname") + "</a>, " + rs.getString("email") + ", "
								+ rs.getString("cre_date") + ", " + rs.getString("mod_date") + ", "
								+ rs.getString("user_id") + ", " + rs.getString("sal") + "<br/> ");

			}
			out.println("</body></html>");

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
			if (stmt != null) {
				try {
					stmt.close();
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
}
