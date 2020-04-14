<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조</title>

<script type="text/javascript">
	var nameList = new Array();
	
	nameList[0] = '박성욱';
	nameList[1] = '이정주';
	nameList[2] = '박지훈';
	nameList[3] = '이환상';
		
	for (var i = 0; i < nameList.length; i++) {
		document.write('<h5>'+ (i+1) + ' ' + nameList[i] + '</h5>');
	}		
</script>

</head>


<body>

</body>

</html>





