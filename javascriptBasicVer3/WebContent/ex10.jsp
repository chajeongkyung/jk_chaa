<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style type="text/css">
	div{
		width: 200px;
		border: 1px solid black;
		background-color: gray;
	}
</style>

<script type="text/javascript">
	/*3-47참조*/
	function aTagLikeFnc() {
		location.href = 'https://www.w3schools.com/';
	}
	function imgBtnFnc() {
		location.href = 'https://search.naver.com/search.naver?where=image&sm=tab_jum&query=%EC%A7%91#imgId=cafe12593431%7C305%7C3753184_512971064&vType=rollout';
	}

</script>
</head>

<body>
	<div onclick="aTagLikeFnc();">나는 버튼이다</div>
	<img alt="사진이다" src="home.jpg" style="width:200px;" onclick="imgBtnFnc();">
</body>
</html>