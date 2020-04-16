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

	var sum = 0;
	function gugudanFnc(param) {		
		param = param.trim();
		sum = 100 + Number(param);
		
		alert(sum);
	}
	
</script>

</head>

<body>
	<button onclick="gugudanFnc('   2   ')">2단</button>
</body>
</html>