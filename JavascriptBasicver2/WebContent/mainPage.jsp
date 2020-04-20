<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">

   #page {
      width: 1024px;
      height: 768px;
      margin: 100px auto;
   /*    border : 1px solid black; */
   }

   #navi {
      width: 866px;
      height: 50px;
      border-radius: 5px;
      background-color: #666666;
      margin: 0px auto;
   }

   #loginBtn {
      width: 71px;
      height: 34px;
      color: #FFFFFF;
      border-radius: 5px;
      background-color: #5BC0DE;
      border: none;
      margin: 8px 0px 8px 15px;
      font-size: 14px;
      
   }

    #loginContent {
      width: 336px;
      height: 176px;
      border: 2px solid #C0C0C0;
      margin-top : 80px;
      padding : 40px 60px 40px 60px;
      margin : 80px auto 0px auto;
   }
   
   .inputText {
      width : 178px;
      height: 27px;
      border-radius: 5px;
      margin : 5px;
       padding : 10px;
       border: 1px solid black;
   }
 
    #loginBtn2{
       width : 99px;
       height: 111px;
       background-color: #CC9933;
       margin : 3px 3px 3px 15px;
       color: #FFFFFF;
       border-radius: 5px;
       border : none;
    
    }
    
    #loginInput {
       margin-bottom: 30px;
    }
    
    .loginText{
       border: 1px solid black;
       margin: 0px;
      background-color: #CCCCCC;
      width : 104px;
      height: 31px;
    }
</style>
	
</head>
<body>
  <div id="page">
   
   <!-- 네비게이션 바 -->
      <div id="navi">
      	<a href="mainPage.jsp">
	         <input id="loginBtn" type="button" value="로그인">  	
      	</a>

      </div>

      <div id="mainContents">
      
      <!-- 로그인 폼 -->
         <div id="loginContent">
            <form action="loginPage.jsp">
               <div id="loginInput" style="float:left;">
                  <div>
                     <input class="inputText" type="text" placeholder="아이디">
                  </div>
                  <div>
                     <input class="inputText" type="password" placeholder="비밀번호">
                  </div>
               </div>
               <div>               
                  <input id="loginBtn2" type="submit" value="로그인">
               </div>
               
               <div style="clear:left;">
                  <!-- 다른경로로 보낼 수 있다 -->
                  <a href="loginPage4.jsp"><input class="loginText" type="button" value="회원가입"></a>      
                  <a href="loginPage2.jsp"><input class="loginText" type="button" value="아이디 찾기"></a>      
                  <a href="loginPage3.jsp"><input class="loginText" type="button" value="비밀번호 찾기"></a>      
                           
               </div>
            </form>
         </div>
         
      </div>
   </div>

<script type="text/javascript">
	
</script>
</html>