<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
</head>
<body>
	Enter your name
	<input type="text" id="fname"
			 onblur="myFunction()" onfocus="changeColorFnc();">
	<button>
		그냥 새로 페이지 만들지 말자 이걸로 계속 도전
	</button>

</body>

<script type="text/javascript">

	function myFunction() {
		var x = document.getElementById("fname");
		x.style.background = "white";
	}
	
	function changeColorFnc() {
		var x = document.getElementById("fname");
		x.style.background = "yellow";
	}
	
</script>
</html>