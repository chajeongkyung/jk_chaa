package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.dto.MemberDto;

@WebServlet("/member/list") 
public class MemberListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection conn = null; // 연결
		PreparedStatement pstmt = null; // 상태
		ResultSet rs = null; // 결과
		
		try {
			ServletContext sc = this.getServletContext();
			
			conn = (Connection)sc.getAttribute("conn");
			
			//3.sql 실행 객체 준비
			// sql 실행문
			
			String sql = "SELECT MNO, MNAME, EMAIL, CRE_DATE" 
					+ " FROM MEMBER" 
					+ " ORDER BY MNO ASC";

			pstmt = conn.prepareStatement(sql);
			// 4.결과 가져오기 (여기까지 비즈니스)
			rs = pstmt.executeQuery();

			System.out.println("쿼리수행성공");
			
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			
			//new=호출
			ArrayList<MemberDto> memberList = 
					new ArrayList<MemberDto>();
			
			int mno = 0;
			String mname = "";
			String email = "";
			Date creDate = null;
			
			//rs에 있는 데이터를 인스턴스 변수에 하나씩 넣어준다
			//db에 데이터를 한줄한줄 set
			while (rs.next()) {
				mno = rs.getInt("MNO");
				mname = rs.getString("MNAME");
				email = rs.getString("EMAIL");
				creDate = rs.getDate("CRE_DATE");
				
				MemberDto memberDto = new MemberDto();
				memberDto.setNo(mno);
				memberDto.setName(mname);
				memberDto.setEmail(email);
				memberDto.setCreateDate(creDate);

				memberList.add(memberDto);
				
			}
			
			//*setAttribute는 클래스를 담을 수 있다, setParam은 문자열만 들어간다
			//내가 만든 페이지를 다른 페이지에서 사용할 수 있게 됐다!!
			//requesr에 회원 목록 데이터 보관
			request.setAttribute("memberList", memberList);
			
			//jsp페이지로 출력을 위임한다
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/member/MemberListView.jsp");
			
			//데이터의 가변으로 인해 무조건 작성해야된다
			//데이터를 지키면서 넘기겠다! 경로에는 나타나지 않는다
			dispatcher.include(request, response);

			System.out.println("나 실행된다?");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			throw new ServletException(e);
			request.setAttribute("error", e);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(request, response);
		} finally {
			if (rs != null) {
				try {
					rs.close();
					System.out.println("ResultSet 종료");
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}

			// 상태 해제
			if (pstmt != null) {
				try {
					pstmt.close();
					System.out.println("쿼리(질의) 종료");
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		} // finally 종료
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}