<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	function idCheckFnc() {
		var idObj = document.getElementById('inputId');
		var idVal = idObj.value;
		
		var resultObj = document.getElementById('resultDiv');
		
		if(idVal.length >= 4){
			resultObj.style.color = 'black';
			resultObj.innerHTML = '사용가능합니다';		
		}else {
			resultObj.stylase.color = 'red';
			resultObj.innerHTML = '다시 입력해주세요';				
		}
		
	}
	window.onload = function() {		
		var idObj = document.getElementById('inputId');
		idObj.addEventListener('keyup',idCheckFnc,false);			
	}
		
	
</script>
	
</head>
<body>

	<div>
		<span>아이디</span><input id='inputId' type="text">
	</div>
	<div id='resultDiv'>
	</div>
	

</body>
</html>