<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	var team = new Array();

	team[0] = {
		name : '김홍',
		age : 27,
		level : '팀장'
		
	}
	
	team[1] = {
		name : '이정주',
		age : 26,
		level : '꼴찌'
			
	}
	
	team[2] = {
		name : '차정경',
		age : 25,
		level : '보조'
		
	}
	
	var str = '';
	
	for (var i = 0; i < team.length; i++) {
		str = '';
		
		str = str + team[i].name + '\n';
		str = str + team[i].age + '\n';
		str = str + team[i].level + '\n\n';	
		
		alert(str);		
	}
	
	
</script>

</head>

<body>



</body>
</html>