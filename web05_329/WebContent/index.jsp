<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	
	//컨트롤러로 보낸다! 컨트롤러 없이는 화면을 띄울 수 없게!!
	function listPageMoveFnc() {
		location.href = "<%=request.getContextPath()%>/auth/login";		
	}

</script>

</head>

<body>

	<p onclick="listPageMoveFnc();">329페이지</p>
	
</body>

</html>