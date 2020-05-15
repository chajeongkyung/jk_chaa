package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/member/delete")
public class MemberDeleteServlet extends HttpServlet{
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      // TODO Auto-generated method stub
      Connection conn = null;
      PreparedStatement pstmt = null;
      
      ServletContext sc = this.getServletContext();
      
      req.setCharacterEncoding("UTF-8");
      
      int mNo = Integer.parseInt(req.getParameter("no"));
      
      System.out.println("회원번호" + mNo + "삭제를 한다");
      
      try {
         try {
            conn = (Connection) sc.getAttribute("conn");
            //공백 필수!!!!

            String sql = "DELETE FROM MEMBER";
            		sql += " WHERE mno = ?";
               
            pstmt = conn.prepareStatement(sql);
            
            pstmt.setInt(1, mNo);
            
            // db에 데이터 추가,자동커밋이 작동된다.
            pstmt.executeUpdate();
            
            int resultNum = pstmt.executeUpdate();
            System.out.println("수행결과: " + resultNum);
            
            // 바로 페이지로 넘어가는
            res.sendRedirect("./list");
            
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("delete 수행 실패");
         }
      }finally {
         if(pstmt != null) {
            try {
               pstmt.close();
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
               System.out.println("pstmt 종료 실패");
            }
         }
         
      }
      
      
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      // TODO Auto-generated method stub
      System.out.println("나중에 여기서 삭제 처리하자");
   }
   
}