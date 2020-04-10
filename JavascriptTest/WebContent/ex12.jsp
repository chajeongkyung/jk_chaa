<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조</title>

<script type="text/javascript">

	var questionStr = '';
	questionStr = 'web js hi psu';
	
	var solutionStr = '';
	var findIndex = questionStr.indexOf("js");
	
	if (findIndex < 0) {
		solutionStr = "js 없음";
	}else{
		solutionStr = "js 포함";
		
	}

	alert(solutionStr);
	
</script>

</head>


<body>

	
</body>

</html>





