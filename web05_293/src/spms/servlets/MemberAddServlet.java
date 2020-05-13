package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberAddServlet extends HttpServlet{

	@Override
	//doGet은 사용자에게 보여지는 메서드
	protected void doGet(HttpServletRequest req,
			HttpServletResponse res)
					throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		res.setContentType("text/html");
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		
		String htmlStr = "";
		
		htmlStr += "<html><head><title>회원 등록</title></head>";
		htmlStr += "<body>";
		htmlStr += "<h1>회원등록</h1>";
		htmlStr += "<form action='./add' method='post'>";
		htmlStr += "이름: <input type='text', name='name'><br>";
		htmlStr += "이메일: <input type='text', name='email'><br>";
		htmlStr += "암호: <input type='password', name='password'><br>";
		htmlStr += "<input type='submit', value='추가'>";
		htmlStr += "<input type='reset', value='취소'>";
		htmlStr += "</form>";
		htmlStr += "</body></html>";
		
		out.println(htmlStr);
	}
	
	//doPost는 서버와 관련된 메서드
	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jsp";
		String password = "jsp12";
		String driverUrl = "oracle.jdbc.driver.OracleDriver";
		
//		req.setCharacterEncoding("UTF-8"); //한글 깨짐 방짐
		
		//사용자의 입력을 받는다
		//"email" -> input태그의 네임이다
		String emailStr = req.getParameter("email");
		String pwdStr = req.getParameter("password");
		String nameStr = req.getParameter("name");
		
		try {
			Class.forName(driverUrl);
			conn = DriverManager.getConnection(url, user, password);
			
			//?는 변화할 수 있는 값
			String sql = "insert into member "
//					+ "(mno, email, pwd, mname, cre_date, mod_date)"
					+ "value(mno, email, pwd, mname, cre_date, mod_date)"
					+ "values(member_mno_seq.nextval, ?, ?, ?, sysdate, sysdate)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, emailStr);
			pstmt.setString(2, pwdStr);
			pstmt.setString(3, nameStr);
			
//			executeQuery()가 select
//			executeUpdate()가 insert이다
			pstmt.executeUpdate();
			
			//화면만드는부분
			res.setContentType("text/html");
			res.setCharacterEncoding("UTF-8");
			
			PrintWriter out = res.getWriter();
			
			String htmlStr = "";
			
			htmlStr += "<html><head><title>회원등록결과</title></head>";
			htmlStr += "<meta http-equiv='Refresh'";
			htmlStr += "content='1; url=./list'>";
			htmlStr += "</head>";
			
			
			htmlStr += "<body>";
			htmlStr += "<p>등록 성공입니다.!</p>";
//			htmlStr += "<a href='./list'><button>목록보기</button></a>";
			htmlStr += "</body></html>";
					
			out.println(htmlStr);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("jdbc 오라클 드라이버 로드 실패");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("insert into member 수행 실패");
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					System.out.println("pstmt 종료 실패");
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					System.out.println("db연결 해제 실패");
				}
			}//if 종료
		}//finally 종료
	}
}
