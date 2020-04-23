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
/*ul li 태그만들기*/
window.onload = function() {
	var newUlTag = document.createElement('ul');
	var newLiTag = document.createElement('li');
	var newLiTag2 = document.createElement('li');
	
	var newText = document.createTextNode('리스트1');
	var newText2 = document.createTextNode('리스트2');
	
	newUlTag.appendChild(newLiTag);
	newLiTag.appendChild(newText);
	newUlTag.appendChild(newLiTag2);
	newLiTag2.appendChild(newText2);
		
	var bodyTag = document.getElementsByTagName('body')[0];
	bodyTag.appendChild(newUlTag);
}
   
</script>

</head>

<body>

<!--    <ul> -->
<!--       <li>리스트1</li> -->
<!--       <li>리스트2</li> -->
<!--    </ul> -->

</body>
</html>