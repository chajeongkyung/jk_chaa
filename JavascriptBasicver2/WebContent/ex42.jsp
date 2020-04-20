<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>   
<script type="text/javascript">

	function inputFnc() {
		var nameObj = document.getElementById('inputName');
		var yearObj = document.getElementById('inputYear');
		
		var nameVal = nameObj.value;
		var yearVal = yearObj.value;
	
		var divObj = document.getElementById('divLine');
		
		divObj.innerHTML = '이름:' + nameVal;
		divObj.innerHTML += '<br/>';
		divObj.innerHTML += '태어난 해:' + yearVal;
	}

	window.onload = function(){
		//실행되자마자 보더
		var divObj = document.getElementById('divLine');
		divObj.style.border = '1px solid black';
		
		var btn = document.getElementById('divBtn');
		btn.onclick = inputFnc; 
	}	
	
</script>

</head>

<body>
	<div id='divBtn' style="border: 1px solid black;">버튼</div>
	
	<div>
		<span>이름</span><input id="inputName" type="text" value="">
		<span>태어난 해</span><input id="inputYear" type="text" value="">
	</div>
	
	<div id="divLine">보더준다(실행하자마자)
		이곳 안의 내용이 결과로 출력되어야 하는 영역이다.
	</div>
   
</body>

</html>