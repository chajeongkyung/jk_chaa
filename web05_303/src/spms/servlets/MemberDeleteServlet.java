package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MemberDeleteServlet extends HttpServlet{
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      // TODO Auto-generated method stub
      Connection conn = null;
      //statement 이후 보완하여 나온게 PreparedStatement!!
      PreparedStatement pstmt = null;
      
      ServletContext sc = this.getServletContext();
      
      String driver = sc.getInitParameter("driver");
      String url = sc.getInitParameter("url");
      String user = sc.getInitParameter("user");
      String password = sc.getInitParameter("password");
      
      req.setCharacterEncoding("UTF-8");
      
      //사용자의 입력을 받는다
      int mNo = Integer.parseInt(req.getParameter("mNo"));
      
      System.out.println("회원번호" + mNo + "삭제를 한다");
      
      try {
         Class.forName(driver);
         try {
            conn = DriverManager.getConnection(url, user, password);
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
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         System.out.println("jdbc 오라클 드라이버 로드 실패");
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
         
         if(conn != null) {
            try {
               conn.close();
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
               System.out.println("db연결 해제 실패");
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