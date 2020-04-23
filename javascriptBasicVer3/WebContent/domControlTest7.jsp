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
		var btnObj = document.getElementById('deleteUlBtn');	
		
		btnObj.addEventListener('click', addFnc, false);
	}
	
	function addFnc() {
		var ulObj = document.getElementsByTagName('ul')[0];
		var copyUlObj = ulObj.cloneNode(true);
		var bodyObj = document.getElementsByTagName('body')[0];
		
		bodyObj.appendChild(copyUlObj);
	}

</script>

</head>

<body>
   <h1 id='deleteUlBtn'>문서 객체 조작 버튼</h1>

   <ul>
      <li>리스트1</li>
      <li>리스트2</li>
      <li>리스트3</li>
      <li>리스트4</li>
   </ul>
   
   
</body>
</html>





