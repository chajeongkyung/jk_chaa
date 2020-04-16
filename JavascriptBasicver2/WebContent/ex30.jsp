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

	function gugudanFnc(danStr) {
		
		var num = 0;
		num = danStr.substring(0,1);
		//num = danStr.charAt(0);
		
		var result = '';
		for (var i = 1; i <= 9; i++) {
			result += num * i + '\n';
		}
		alert(result);
	}
	
</script>

</head>

<body>
	<button onclick="gugudanFnc('2단')">2단</button>
	<button onclick="gugudanFnc('3단')">3단</button>
	<button onclick="gugudanFnc('4단')">4단</button>
</body>
</html>