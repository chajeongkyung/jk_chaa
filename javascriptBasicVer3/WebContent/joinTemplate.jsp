<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>

<script type="text/javascript">
	
	function requestJoinInfoFnc() {
		
		var idObj = document.getElementById('userId1');
		var pwdObj = document.getElementById('userPwd2');
		var urlStr = '';
		
		urlStr += '?' + idObj.name; 
		urlStr += '=' + idObj.value; 
		urlStr += '&' + pwdObj.name;
		urlStr += '=' + pwdObj.value;
		
		location.href = 'getJoinInfo.jsp' + urlStr;
	}
	
</script>
</head>

<body>
	<div style="border: 1px solid black;">
		<form action="getJoinInfo.jsp">
			<div>
				<input type="text" name='userId' id='userId' value="">
			</div>
			<div>
				<input type="text" name='userPwd1' id='userPwd1' value="">
			</div>
			<div>
				<input type="submit" value="data 전달">
			</div>		
		</form>
	</div>
<!-- 	submit과 같은 fnc -->
	<div style="border: 1px solid black;">
		<form action="getJoinInfo.jsp">
			<div>
				<input type="text" name='userId' id='userId1' value="">
			</div>
			<div>
				<input type="text" name='userPwd1' id='userPwd2' value="">
			</div>
			<div>
				<img onclick="requestJoinInfoFnc();" 
					style="width: 100px; height: 100px;" src="home.jpg">
			</div>		
		</form>
	</div>
	
	
		
</body>
</html>