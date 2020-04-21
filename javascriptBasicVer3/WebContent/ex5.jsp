<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#myDiv1, #myDiv2 {
	background-color: coral;
	padding: 50px;
}

#myP1, #myP2 {
	background-color: white;
	font-size: 20px;
	border: 1px solid;
	padding: 20px;
}
</style>

<script type="text/javascript">
	
	function test() {
		alert("p> You clicked the white element!");
	}
	function test2() {
		alert("div> You clicked the orange element!");
	}

	window.onload = function() {
		//false는 나 먼저 -> Bubbling
		document.getElementById("myP1").addEventListener(
				"click", test, false);

		document.getElementById("myDiv1").addEventListener(
				"click", test2, false);
		//true 부모부터 시작 -> capturing
		document.getElementById("myP2").addEventListener(
				"click", test, true);

		document.getElementById("myDiv2").addEventListener(
				"click", test2, true);
	}
		
	</script>

</head>

<body>

	<h2>JavaScript addEventListener()</h2>

	<div id="myDiv1">
		<h2>Bubbling:</h2>
		<p id="myP1">Click me!</p>
	</div>
	<br>

	<div id="myDiv2">
		<h2>Capturing:</h2>
		<p id="myP2">Click me!</p>
	</div>

</body>
</html>