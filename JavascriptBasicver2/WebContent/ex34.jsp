<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

</style>

</head>

<!-- input태그에서 value는 정말 중요하다 -->
<body>
	<div>
		1.숫자를 입력해주세요
		<input id='yourNumber1' type="text" value="">
	</div>
	<div>
		2.숫자를 입력해주세요
		<input id='yourNumber2' type="text" value="">
	</div>
	<div>
		<input type="button" value="+10버튼" onclick="calculFnc();">
		<button onclick="sumFnc();">두 수를 더하는 버튼</button>
	</div>
	
</body>
<script type="text/javascript">

	function calculFnc() {		
		var yourNumber1 = document.getElementById('yourNumber1');
		var num = yourNumber1.value;
		var sum = Number(num) + 10;		
		
		yourNumber1.value = sum;		
	}
	
	function sumFnc() {
		var yourNumber1 = document.getElementById('yourNumber1');
		var yourNumber2 = document.getElementById('yourNumber2');
		var numVal1 =  yourNumber1.value ;
		var numVal2 =  yourNumber2.value ;
		
		var sum = Number(numVal1) + Number(numVal2);		
		
		alert(sum);
		
	}
	
</script>
</html>




