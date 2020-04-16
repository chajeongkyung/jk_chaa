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

	<h2>JavaScript Number Methods</h2>

	<p>The toString() method converts a number to a string.</p>

	<p id="demo"></p>
	
</body>
<script type="text/javascript">
	/* var x = 123;	
	document.getElementById("demo").innerHTML = x.toString() + "<br>"
			+ (123).toString() + "<br>" + (100 + 23).toString(); */
	
	//숫자화 시켜주는 함수 valueOf()		
	/* var x = '123';
	alert(x.valueOf() * 10); */	
	
	//숫자화 시켜주는 함수 Number()
	//var num = '10';
	var num = Number('     10');
	var sum = 0;
	
	sum = 100 + num;
	alert(sum);
	
	document.getElementById("demo").innerHTML = 
		  Number(true) + "<br>" +
		  Number(false) + "<br>" +
		  Number("10") + "<br>" + 
		  Number("  10") + "<br>" +
		  Number("10  ") + "<br>" +
		  Number(" 10  ") + "<br>" +
		  Number("10.33") + "<br>" + 
		  Number("10,33") + "<br>" +
		  Number("10 33") + "<br>" +
		  Number("John");

</script>
</html>




