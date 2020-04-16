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

<body>
	
	숫자를 입력해주세요
	<input id='yourNumberObj' type="text">
	
	<input type="button" value="계산 버튼" onclick="calcul()">
	버튼을 누르면 누군가 적은 숫자를 +10 해준다 
	
</body>
<script type="text/javascript">

	function calcul() {		
		var sum = 0;
		var num = document.getElementById('yourNumberObj');
		var num1 = num.value;
		num = Number(num1);
		sum = num + 10;
		
		alert(sum);
	}
	
</script>
</html>




