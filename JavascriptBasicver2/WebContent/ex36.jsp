<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	#divBtn{
		width : 150px;
		height: 22px;
		text-align: center;
		background-color: buttonface;
	    box-sizing: border-box;
	    font: 400 13.3333px Arial;
	    padding: 1px 6px;
	    border-width: 2px;
	    border-style: outset;
	    border-color: buttonface;
  
	}
</style>
</head>

<body>
<!-- input이 있다면 무조건 form으로 감쌀 것 -->
   <form action="ex22.jsp">
      1.숫자를 입력해주세요 <input id='yourNumber1' type="text" value="">
      <br>
      2.숫자를 입력해주세요 <input id='yourNumber2' type="text" value="">
      <br><br>
    <!-- 세 개의 차이를 알기 (버튼의 디폴트값이 액션의 영향을 받는다)폼과의 연관성을 알고 사용하기-->
      <div>
      <!-- input은 절대 넘어가지 않는다 -->
         <input type="button" onclick="nameFnc();" value="inputButton">
         <input type="submit" value="submitButton">
         <button onclick="nameFnc();">button태그</button>
      </div>
   </form>
   
   
  	 <div id="divBtn">
  		 <a style="text-decoration: none;" href="./ex33.jsp">와 나만의 버튼</a>
  	 </div>
   
   
   
</body>
<script type="text/javascript">
   function nameFnc() {
	alert('신기하네');
}
</script>

</html>