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
		var btnObj = document.getElementById('updateBtn');
		
		btnObj.addEventListener('click', addFnc, false);		
	}
	
	function addFnc() {
		var ulObj = document.getElementsByTagName('ul')[0];		
		var bodyObj = document.getElementsByTagName('body')[0];
		
		var copyulObj = ulObj.cloneNode(true);		
		
		if (copyulObj.children[0].innerHTML != '리스트1') {			
			//순서정렬
			var liObjList = copyulObj.getElementsByTagName('li');
			var copyLiObj = liObjList[3].cloneNode(true);
			
			copyulObj.insertBefore(copyLiObj, liObjList[0]);
			
			copyulObj.removeChild(liObjList[4]);
		}
		//복제한다
		bodyObj.insertBefore(copyulObj, ulObj);
		
		
	}


</script>

</head>

<body>
   <h1 id='updateBtn'>문서 객체 조작 버튼</h1>

   <ul>
      <li>리스트2</li>
      <li>리스트3</li>
      <li>리스트4</li>
      <li>리스트1</li>
   </ul>
   
   
   
</body>
</html>





