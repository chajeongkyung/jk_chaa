<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>   
<script type="text/javascript">

	window.onload = function(){
		var nameObj = document.getElementById('inputName');
		var yearObj = document.getElementById('inputYear');
		var myBtn = document.getElementById('divBtn');	
		
		var divObj = document.getElementById('divLine');
		divObj.style.border = '1px solid black';
		
		var nameVal = nameObj.value;
		var yearVal = yearObj.value;
		
		inputName.value = nameVal;
		inputYear.value = yearVal;
	
	}	
	
</script>

</head>

<body>
	<div id='divBtn' style="border: 1px solid black;">버튼</div>
	
	<div>
		이름<input id="inputName" type="text" value="">
		태어난 해<input id="inputYear" type="text" value="">
	</div>
	
	<div id="divLine">보더준다(실행하자마자)
		이곳 안의 내용이 결과로 출력되어야 하는 영역이다.
	</div>
   
</body>

</html>