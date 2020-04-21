<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	function findPwdFnc() {
		var txtObj = document.getElementById('findArea');
		var pwdObj = document.getElementById('pwd');
		var pwdVal = pwdObj.value;
		
		txtObj.innerHTML = pwdVal;
	}
	
	window.onload = function() {
		var divObj = document.getElementById('findPwdDiv');
		divObj.style.border = '1px solid black';
		
		var pwdBtn = document.getElementById('pwdBtn');
		pwdBtn.addEventListener('click',findPwdFnc,false);		
			
	}
		
	
</script>
	
</head>
<body>

	<div id='findPwdDiv'>
		<input id='pwd' type="password">	
		<button id='pwdBtn'>비밀번호 찾기</button>
	</div>
	
	<textarea id='findArea' rows="2" cols="12"></textarea>

</body>
</html>