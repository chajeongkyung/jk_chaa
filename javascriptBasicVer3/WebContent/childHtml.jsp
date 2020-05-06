<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function windowCloseFnc() {
		var inputObj = document.getElementById('childValue');
		
		var inputParentObj = window.opener.document.getElementById('parentValue');
		
		inputParentObj.value = inputObj.value;
		
		window.close();
	}
	
	window.onload = function() {
		var inputObj = document.getElementById('childValue');
		
		var inputParentObj = window.opener.document.getElementById('parentValue');
		
		inputObj.value = inputParentObj.value;
	}
</script>
	
</head>
<body>
	<button onclick="windowCloseFnc();" >날 클릭하면 팝업창이 종료됨</button>
	<p><img src="./image/popup.jpg" alt="이달에 새로나온책"  usemap="#pop"/></p>
	<map name="pop" id="pop">
    <area shape="rect" coords="228,371,294,399" href="#" alt="창닥기"/>
	</map>
	
	<input type="text" id='childValue'>
</body>
</html>