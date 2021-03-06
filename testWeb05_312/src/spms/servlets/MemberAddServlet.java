package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/member/add")
public class MemberAddServlet extends HttpServlet{

	@Override
	//doGet은 사용자에게 보여지는 메서드
	protected void doGet(HttpServletRequest req,
			HttpServletResponse res)
					throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 RequestDispatcher dispatcher = 
	    		  req.getRequestDispatcher("./AddForm.jsp");

	      dispatcher.forward(req, res);
	
	}
	
	//doPost는 서버와 관련된 메서드
	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt = null;

		ServletContext sc = this.getServletContext();
		
		String emailStr = req.getParameter("email");
		String pwdStr = req.getParameter("password");
		String nameStr = req.getParameter("name");
		
		try {

			conn = (Connection)sc.getAttribute("conn");
			
			String sql = "insert into member "
					+ "value(mno, email, pwd, mname, cre_date, mod_date)"
					+ "values(member_mno_seq.nextval, ?, ?, ?, sysdate, sysdate)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, emailStr);
			pstmt.setString(2, pwdStr);
			pstmt.setString(3, nameStr);
			
			pstmt.executeUpdate();
			
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
			htmlStr += "</body></html>";
					
			out.println(htmlStr);
			
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
		}//finally 종료
	}
}
