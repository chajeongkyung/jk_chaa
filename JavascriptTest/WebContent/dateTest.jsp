<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
   
   function dataTestFnc() {
	   var today = new Date();
		
		var nowYear = today.getFullYear();
		var nowMonth = today.getMonth() + 1; //현재 월  (0~11)
		var nowDate = today.getDate(); //현재 일
		var nowDay = today.getDay(); //현재 요일 (0:일요일~6:토요일)
		var nowHours = today.getHours(); //현재 시간(0~23)
		var nowMinutes = today.getMinutes(); //현재 분(0~59)
		var nowSeconds = today.getSeconds(); //현재 초(0~59)
		var nowTime = today.getTime(); //1970년1월1일부터 밀리초 경과된 시간

		if(nowMonth < 10){
			nowMonth = '0' + nowMonth;
		}
		if(nowDate < 10){
			nowDate = '0' + nowDate;
		}
		
		if(nowDay == 0){
			nowDay = "일요일";
		}else if(nowDay == 1)
		{
			nowDay = "월요일";
		}else if(nowDay == 2)
		{
			nowDay = "화요일";
		}else if(nowDay == 3)
		{
			nowDay = "수요일";
		}else if(nowDay == 4)
		{
			nowDay = "목요일";
		}else if(nowDay == 5)
		{
			nowDay = "금요일";
		}else if(nowDay == 6)
		{
			nowDay = "토요일";
		}
		
		document.getElementById('dateTxt').value 
		= nowYear + '-' + nowMonth + "-" + nowDate + nowDay;		
      
   }
</script>

</head>

<body>

   <div style="border: 1px solid black;">
      <button onclick="dataTestFnc()" style="border: 1px solid black;">
       	  버튼
      </button>
      <input id='dateTxt' type="text" value="">
   </div>


</body>
</html>