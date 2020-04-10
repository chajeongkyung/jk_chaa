<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	var today = new Date();
	var nowDay = today.getDay(); //현재 요일 (0:일요일~6:토요일)
	var dayList = ["Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"];
	
	today.setDate(11);
	nowDay = today.getDay();
	
	if(nowDay == 0){
		document.write(dayList[0]);
	}else if(nowDay == 1)
	{
		document.write(dayList[1]);
	}else if(nowDay == 2)
	{
		document.write(dayList[2]);
	}else if(nowDay == 3)
	{
		document.write(dayList[3]);
	}else if(nowDay == 4)
	{
		document.write(dayList[4]);
	}else if(nowDay == 5)
	{
		document.write(dayList[5]);
	}else if(nowDay == 6)
	{
		document.write(dayList[6]);
	}

	
</script>
	
</head>
<body>
	

</body>
</html>