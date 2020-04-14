<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<body>
   <button onclick="setGugudan();">입력</button>
   <button onclick="getGugudan();">출력</button>

</body>

<script type="text/javascript">
/*구구단 배열로 짜보기*/
	var danArr = new Array();
	var resultArr = new Array();
	var idx = 0;	

	function setGugudan() {		
		//단을 저장
		for (var i = 2; i <= 9; i++) {	
			danArr[i] = i+'단';					
		}	
		//값을 저장하는 for문
		for (var i = 2; i <= 9; i++) {	
			for (var j = 1; j <= 9; j++) {				
				resultArr[idx] = (i*j);	
				idx++;
			}			
		}
		
	}
	
	function getGugudan() {
		//출력 for문
		idx = 0;
		for (var i = 2; i <= 9; i++) {		
			document.write(danArr[i]);
			document.write('<br>');
			for (var j = 1; j <= 9; j++) {				
				document.write(i + '*' + j + '=' + resultArr[idx] + '\t');
				idx++;
			}
			document.write('<br>');
		}
		
	}	


//2번째
/* 	var resultArr2 = new Array();
	var idx2 = 0;
	
	for (var i = 2; i <= 9; i++) {
		document.write(i + '단' + 
				'&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp');
	}
	document.write('<br/>');	
	
	for (var i = 1; i <= 9; i++) {
		for (var j = 2; j <= 9; j++) {
			resultArr2[idx2] = j*i;
			idx2++;
		}
	}
	
	idx2 = 0;
	for (var i = 1; i <= 9; i++) {
		for (var j = 2; j <= 9; j++) {
			document.write(j + '*' + i + '=' + resultArr2[idx2]);
			document.write('&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp');
			idx2++;
		}
		document.write('<br/>');	
	} */

 	
	
	
	
	
</script>

</html>






