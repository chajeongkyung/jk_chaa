package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

		RequestDispatcher rd = null;
		
		try {
			String noStr = req.getParameter("no");
			int no = Integer.parseInt(noStr);

			ServletContext sc = this.getServletContext();
			
			conn = (Connection) sc.getAttribute("conn");

			// 데이터베이스는 대문자로 한다
			String sql = "SELECT MNO, EMAIL, MNAME, CRE_DATE " 
					+ "FROM MEMBER " 
					+ "WHERE MNO = ?";

			// sql실행문
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();

			String name = "";
			String email = "";
			Date creDate = null;
			
			MemberDto memberDto = new MemberDto();

			if (rs.next()) {
				name = rs.getString("MNAME");
				email = rs.getString("EMAIL");
				creDate = rs.getDate("CRE_DATE");
				
				memberDto.setNo(no);
				memberDto.setName(name);
				memberDto.setEmail(email);
				memberDto.setCreateDate(creDate);
			}else {
				throw new Exception("해당 번호의 회원을 찾을 수 없습니다.");
				
			}
		
			req.setAttribute("memberDto", memberDto);
			rd = req.getRequestDispatcher("MemberUpdateForm.jsp");
			rd.forward(req, res);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			req.setAttribute("error", e);
			rd = req.getRequestDispatcher("/Error.jsp");
			rd.forward(req, res);
		} finally {
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

			resp.sendRedirect("../member/list");

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
	
		} // finally 종료

	}// doPost종료

}
