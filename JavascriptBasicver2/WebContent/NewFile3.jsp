<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	p {
		background-color: navy;
	}
</style>	
</head>
<body>

	<img id='myImg' onmouseenter="bigImg()" onmouseleave="normalImg()" 
		border="0" src="img7.jpg" alt="Smiley" width="32" height="32">

	<!-- <p id='pObj1' onmouseenter="orangeColor()" onmouseleave="whiteColor()">The function bigImg() is triggered when the user moves the mouse pointer onto the image.</p>
	<p id='pObj2' onmouseenter="orangeColor2()" onmouseleave="whiteColor2()">The function normalImg() is triggered when the mouse pointer is moved out of the image.</p>
 -->
	<p id='pObj1' onmouseenter="bgColor1('orange')" onmouseleave="bgColor1('white')">The function bigImg() is triggered when the user moves the mouse pointer onto the image.</p>
	<p id='pObj2' onmouseenter="bgColor2('orange')" onmouseleave="bgColor2('white')">The function normalImg() is triggered when the mouse pointer is moved out of the image.</p>
	
</body>

<script type="text/javascript">
/*
	function orangeColor() {
		var x = document.getElementById('pObj1');
		x.style.backgroundColor= 'orange';
	} 
	
	function whiteColor() {
		var x = document.getElementById('pObj1');
		x.style.backgroundColor = 'white';
	} 
	function orangeColor2() {
		var x = document.getElementById('pObj2');
		x.style.backgroundColor= 'orange';
	} 
	
	function whiteColor2() {
		var x = document.getElementById('pObj2');
		x.style.backgroundColor = 'white';
	} 
	*/
	function bgColor1(color) {
		var x = document.getElementById('pObj1');
		x.style.backgroundColor= color;
	} 
	
	function bgColor2(color) {
		var x = document.getElementById('pObj2');
		x.style.backgroundColor = color;
	} 
	

	function bigImg() {
		var x = document.getElementById('myImg');
		x.style.height = "100px";
		x.style.width = "100px";
	}

	function normalImg() {
		var x = document.getElementById('myImg');
		x.style.height = "32px";
		x.style.width = "32px";
	}
</script>
</html>