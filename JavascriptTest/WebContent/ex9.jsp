<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조</title>
</head>
<body>

</body>

<script type="text/javascript">
	//<![CDATA[
	var maxNum = Math.max(30, 70, 5);
	document.write("최대값: " + maxNum + "<br />");

	var minNum = Math.min(8, 10, 15);
	document.write("최소값: " + minNum + "<br />");

	var roundNum = Math.round(3.5);
	document.write("반올림: " + roundNum + "<br />");

	var ceilNum = Math.ceil(5.1);
	document.write("소숫점올림: " + ceilNum + "<br />");

	var floorNum = Math.floor(10.5);
	document.write("소숫점내림: " + floorNum + "<br />");

	var absNum = Math.abs(-10);
	document.write("절대값: " + absNum + "<br />");

	var ranNum = Math.random();
	document.write("0~1 난수: " + ranNum + "<br />");
	
	var ranNum1 =(Math.ceil(Math.random()*6));	
	document.write(ranNum1);
	

	//]]>
</script>
</html>





