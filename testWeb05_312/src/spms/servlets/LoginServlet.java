package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
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
import javax.servlet.http.HttpSession;

import spms.dto.MemberDto;

@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, 
		   HttpServletResponse res) 
				   throws ServletException, IOException {
      // TODO Auto-generated method stub

//      res.setCharacterEncoding("UTF-8");

//      include일 경우 res를 써야하고, forward일 경우 쓸 필요 없다
//      그 이유는 forward는 아예 권한을 위임함으로써 이미 LoginForm 에는 UTF-8이 적용되어있지만
//      include는 권한을 현재 페이지가 가지고 있기때문에 여기에는 UTF-8설정이 없기때문에 설정을 따로 해야한다.

      RequestDispatcher dispatcher = 
    		  req.getRequestDispatcher("./LoginForm.jsp");

      dispatcher.forward(req, res);

   }

   @Override
   protected void doPost(HttpServletRequest req, 
		   HttpServletResponse res) 
				   throws ServletException, IOException {
      // TODO Auto-generated method stub

      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null; // 결과

      String sql = "";
      int colIndex = 1;
      
      try {
    	 ServletContext sc = this.getServletContext();
         
    	 conn = (Connection) sc.getAttribute("conn");

    	 String email = req.getParameter("email");
    	 String pwd = req.getParameter("password");
    	 String name = "";
    	 
         sql += "SELECT MNAME, EMAIL";
         sql += " FROM MEMBER";
         sql += " WHERE EMAIL = ?";
         sql += " AND PWD = ?";

         pstmt = conn.prepareStatement(sql);
       
         pstmt.setString(colIndex++, email);
         pstmt.setString(colIndex, pwd);
         
         rs = pstmt.executeQuery();

         //검증은 이미 위에서 끝났으니 대입한다
         if (rs.next()) {
			email = rs.getString("email");
			name = rs.getString("mname");
			
			MemberDto memberDto = new MemberDto();
			
			memberDto.setEmail(email);
			memberDto.setName(name);

			HttpSession session = req.getSession();
			session.setAttribute("memberDto", memberDto);
			
			//데이터는 소멸을 맞이한다->보안성
			res.sendRedirect("../member/list");
         }else {
        	 RequestDispatcher rd = 
        			 req.getRequestDispatcher("./LoginFail.jsp");
        	 rd.forward(req, res);
         }

      } catch (SQLException e) {
         // TODO Auto-generated catch block
          e.printStackTrace();
          //다른쪽으로 옮겼다=위임했다
          throw new ServletException(e);

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
}