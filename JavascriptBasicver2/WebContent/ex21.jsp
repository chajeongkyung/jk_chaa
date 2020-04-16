<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	//현업에서 자주 사용
	var numArr = [];
	
	var nList = new Array();
	
	for (var i = 0; i < 100; i++) {
		numArr[i] = i+1;
	}
	for (var i = 0; i < 100; i++) {
		document.write(numArr[i] + ' ');
		
		if((i+1) % 10 == 0){
			document.write('<br/>');			
		}
	}
	
	for (var i = 0; i < 100; i++) {
		nList[i] = i+1;
	}
	document.write('<br/>');
	for (var i = 0; i < 100; i++) {
		document.write(nList[i] + ' ');
		
		if((i+1) % 10 == 0){
			document.write('<br/>');			
		}
	}
	
	
</script>
	
</head>
<body>
	

</body>
</html>