<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	
	var questionNum='';
	var answerStr = '';
	
	questionNum = 123;
	
	/* 출력 판별식을 삼항 연산자로 작성 
		출력 결과는 출입니다. or 짝입니다.로 출력*/
		
	answerStr = (questionNum % 2 == 0) ? '짝입니다.' : '홀입니다.';	
	document.write(answerStr)
</script>
	
</head>
<body>
	
	
	

</body>
</html>