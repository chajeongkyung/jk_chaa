<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<body>
	<div id='demo'> </div>
</body>

<script type="text/javascript">
//윤년 판별 콘솔로그에 출력
//배열에 2000년부터 2020년까지 있다
	var yearArr = new Array();
	
	for (var i = 0; i <= 20; i++) {
		yearArr[i] = 2000 + i;
	}
	
	for (var i = 0; i < yearArr.length; i++) {
		if ((yearArr[i] % 4 == 0 && yearArr[i] % 100 != 0) 
				|| yearArr[i] % 400 == 0) {
			console.log(yearArr[i] + "년은 윤년이다");
		} else {
			console.log(yearArr[i] + "년은 윤년이 아니다.");
		}
	}
	
	


 </script>

</html>






