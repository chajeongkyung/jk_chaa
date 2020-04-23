<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
</style>

<script type="text/javascript">
	window.onload = function() {
		//리스트1추가
		var theListObj = document.getElementById('theList');
		var liTag = document.createElement('li');
		var liText = document.createTextNode('리스트1');
		
		liTag.appendChild(liText);
		
		var liObjList = theListObj.getElementsByTagName('li');
		
		theListObj.insertBefore(liTag, liObjList[0]);
		
		//리스트5추가
		var liTag2 = document.createElement('li');
		var liText5 = document.createTextNode('리스트5');
		
		liTag2.appendChild(liText5);
		
		theListObj.insertBefore(liTag2, liObjList[4]);
		
		//<h6>추가
		var hTag = document.createElement('h6');
		var hText = document.createTextNode('문서 객체 조작');
		
		var bodyTag = document.getElementsByTagName('body')[0];
		
		hTag.appendChild(hText);		
		
		bodyTag.insertBefore(hTag, theListObj);
		
		

	}
</script>

</head>

<body>
	<h1>문서 객체 조작</h1>
	<h2>문서 객체 조작</h2>
	<h3>문서 객체 조작</h3>
	<h4>문서 객체 조작</h4>
	<h5>문서 객체 조작</h5>
<!-- 	<h6>문서 객체 조작</h6> -->

	<ul id='theList'>
<!-- 		<li>리스트1</li> -->
		<li>리스트2</li>
		<li>리스트3</li>
		<li>리스트4</li>
<!-- 		<li>리스트5</li> -->
	</ul>

</body>
</html>





