<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style type="text/css">
	div{
		border: 1px solid black;
	}
</style>
<script type="text/javascript">
	function inputClickFnc(obj) {
		var inputTextObj = document.getElementById('inputTextObj');
		
		inputTextObj.value = obj.innerHTML;
// 		inputTextObj.innerHTML = '내용이 inputTextObj';
	
	}
	function divClickFnc(obj) {
		var divTextObj = document.getElementById('divTextObj');
		var containerDiv = document.getElementById('container');
		
		//divTestObj.value = '내용이 divTestObj';
// 		divTextObj.innerHTML = obj.innerHTML;
		containerDiv.innerHTML = divTextObj.innerHTML;
		
	}
</script>
</head>
<body>

	<div>
		내용 변환 공간input<input id='inputTextObj' type="text" value="">
	</div>
	
	<div id='divTextObj'>
		<div style="background-color: skyblue;">내용 변환 공간div</div>
	</div>

	<button onclick="inputClickFnc(this)">input버튼</button>
	<button onclick="divClickFnc(this)">div버튼</button>
	
	<div id='container'>
		
	</div>

</body>
</html>