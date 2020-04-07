<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	
/* 연산자.jsp

3 개의 변수를 활용해서 
사칙연산 및
나머지 연산자를 구하시오 */
	
	var num1 = 10;
	var num2 = 20;
	var result = 0;
	
	result = num1 + num2;
	document.write(result + '<br/>');
	
	result = num1 - num2;
	document.write(result + '<br/>');
	
	result = num1 * num2;
	document.write(result + '<br/>');
	
	result = num1 / num2;
	document.write(result + '<br/>');
	
	result = num1 % num2;
	document.write(result);
	
	
</script>
	
</head>
<body>
	

</body>
</html>