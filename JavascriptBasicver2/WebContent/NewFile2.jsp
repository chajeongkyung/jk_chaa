<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
</head>
<body>
	<p>Select a new car from the list.</p>

	<input id='mySelect' type="text" onchange="myFunction()">

</body>

<script type="text/javascript">

/* 자기 자신을 누르면 알림창이 뜨지 않는다 , 글자가 무조건 바껴야 함*/
	function myFunction() {
		var x = document.getElementById("mySelect").value;
	
		alert("글자수는 " + x.length);
	}
	
</script>
</html>