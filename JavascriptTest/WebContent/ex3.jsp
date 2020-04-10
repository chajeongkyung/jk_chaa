<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	function testfnc(paramNum, secondNum) {
		var sum = 0;
		
		for (var i = 0;  i< paramNum; i++) {
			sum = sum + (i+1);
		}
		
		document.write(sum);
	}
	
	testfnc(5,3);
	
</script>
	
</head>
<body>
	
	
	

</body>
</html>