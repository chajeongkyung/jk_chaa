<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>   
<script type="text/javascript">

	function testFnc() {
		alert('버튼1 호출');
	}
	
	window.onload = function(){
		var x = document.getElementsByTagName('button')[1];
		
		x.onmouseover = orangeColor;
		x.onmouseout = whiteColor;
		x.onclick = output;
		
		function orangeColor() {
			x.style.backgroundColor= 'green';
		} 
	
		function whiteColor() {
			x.style.backgroundColor = 'white';
		} 
		
		function output() {
			alert('버튼2 호출');
		}
	}

</script>

</head>

<body>

	<button onclick="testFnc();">
		버튼1
	</button>
	버튼2는 직접적으로 tag를 건드리지 않는다.
	버튼2에 마우스를 올리면 배경색이 변경된다.
	마우스가 버튼2를 벗어나면 배경색은 원래되로 돌아간다.
	버튼2를 클릭하면 알림창으로 버튼2 호출을 보여준다
	<button>
		버튼2
	</button>
	
	
</body>

</html>