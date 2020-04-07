<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	var myAge = 0;
	
	myAge = 34;
	
	if(myAge >= 10 && myAge < 20 ){
		document.write(myAge + '? 10대들은 내 친구');
	}else if(myAge >= 20 && myAge < 30){
		document.write(myAge + '? 20대들은 내 친구');	
	}else if(myAge >= 30 && myAge < 40){
		document.write(myAge + '? 30대들은 내 친구');	
	}else if(myAge >= 40 && myAge < 50){
		document.write(myAge + '? 40대들은 내 친구');	
	}else if(myAge >= 70){
		document.write(myAge + '? 어르신');	
	}
	
	
</script>
	
</head>
<body>
	

</body>
</html>