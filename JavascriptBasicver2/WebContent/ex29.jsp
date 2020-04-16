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

	function gugudanFnc(num) {

		var result = '';
		for (var i = 1; i <= 9; i++) {
			result += num * i + '\n';
		}
		alert(result);
	}
	
</script>

</head>

<body>
	<button onclick="gugudanFnc(2)">2단</button>
	<button onclick="gugudanFnc(3)">3단</button>
	<button onclick="gugudanFnc(4)">4단</button>
</body>
</html>