<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>   
<script type="text/javascript">
	
	function tempFnc() {
		alert('hello script');
	}
	//lazy기술 -> 마지막에 수행된다, 익명함수
	//객체기반이기때문에 .으로 접근한다
	window.onload = function(){
		var myBtn = document.getElementById('divBtn');
		myBtn.onclick = tempFnc;
		alert(myBtn.id);
		alert(myBtn.style.border);
	}	
	
</script>

</head>

<body>
	<div id='divBtn' style="border: 1px solid black;">버튼</div>
   
</body>

</html>