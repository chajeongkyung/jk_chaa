<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	var today = new Date();
	
	var nowYear = today.getFullYear();
	var nowMonth = today.getMonth() + 1; //현재 월  (0~11)
	var nowDate = today.getDate(); //현재 일
	var nowDay = today.getDay(); //현재 요일 (0:일요일~6:토요일)
	var nowHours = today.getHours(); //현재 시간(0~23)
	var nowMinutes = today.getMinutes(); //현재 분(0~59)
	var nowSeconds = today.getSeconds(); //현재 초(0~59)
	var nowTime = today.getTime(); //1970년1월1일부터 밀리초 경과된 시간

	document.write(nowYear + '-' + nowMonth + "-" + nowDate + "<br />");
	
	today.setFullYear(1987);
	today.setMonth(10);
	today.setDate(23);
	
	var month = '';
	if(today.getMonth() < 10){
		month = '0' + today.getMonth();
	}else{
		month = today.getMonth();
	}
	document.write(today.getFullYear() + '년' 
			+ month + "월" 
			+ today.getDate() + "일" +"<br />");
	
	var mon = '';
	if(nowMonth < 10){
		mon = '0' + nowMonth;
	}else{
		mon = nowMonth;
	}
	
	var date = '';
	if(nowDate < 10){
		data = '0' + nowDate;
	}else{
		month = nowDate;
	}
	
	document.write(nowYear + '-' + mon + "-" + nowDate + "&nbsp"
			+ nowHours + ':' + nowMinutes + ':' + nowSeconds);
	


</script>

</head>
<body>


</body>
</html>