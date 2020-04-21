<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	/*DOM Level2*/

	function clickBtn1Fnc() {
		alert('clickBtn1Fnc 호출');
	}

	function clickBtn1OtherFnc() {
		alert('clickBtn10Fnc 호출');
	}
	
	window.onload = function() {
		var myBtn1 = document.getElementById('btn1');
		
		//표현식		
		//myBtn1.addEventListener('이벤트명(on을 제외하고 쓴다)',함수명,아직시기상조);

		if (window.addEventListener) {
			myBtn1.addEventListener('click',clickBtn1Fnc,false);
			myBtn1.addEventListener('click',clickBtn1OtherFnc,false);			
		}else if (window.attachEvent) {
			myBtn1.addEventListener('onclick',clickBtn1Fnc);
			myBtn1.addEventListener('onclick',clickBtn1OtherFnc);
		}
		
	}
		
	
</script>
	
</head>
<body>
	<button id='btn1'>버튼1</button>

</body>
</html>