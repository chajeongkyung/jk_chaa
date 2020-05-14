package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.dto.MemberDto;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/member/update" })
public class MemberUpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse res)
					throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 데이터베이스 관련 객체 변수 선언
		Connection conn = null;// 연결 db그자체
		PreparedStatement pstmt = null;// 상태 문장그자체
		ResultSet rs = null;// 결과 이어주는그자체

		String noStr = req.getParameter("no");

		int mNo = Integer.parseInt(noStr);

		try {

			ServletContext sc = this.getServletContext();
			conn = (Connection) sc.getAttribute("conn");

			// 데이터베이스는 대문자로 한다
			String sql = "SELECT MNO, EMAIL, MNAME, CRE_DATE " 
					+ "FROM MEMBER " 
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
				
				MemberDto memberDto = new MemberDto();
				
				memberDto.setName(mName);
				memberDto.setEmail(email);
				memberDto.setCreateDate(creDate);
				memberDto.setNo(mNo);
				
				req.setAttribute("memberDto", memberDto);
				
			}

		 RequestDispatcher dispatcher = 
	    		  req.getRequestDispatcher("./UpdateForm.jsp");

	      dispatcher.forward(req, res);


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
		} // finally종료

	}// doGet종료

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement pstmt = null;

		ServletContext sc = this.getServletContext();
		conn = (Connection) sc.getAttribute("conn");
		
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		
		int mNo = Integer.parseInt(req.getParameter("no"));

		String sql = "";

		try {

			sql += "update member";
			sql += " set email = ?, " + "mname =?, mod_date=sysdate";
			sql += " where mno = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, email);
			pstmt.setString(2, name);
			pstmt.setInt(3, mNo);

			pstmt.executeUpdate();

			resp.sendRedirect("./list");

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} // if 종료
		} // finally 종료

	}// doPost종료

}
