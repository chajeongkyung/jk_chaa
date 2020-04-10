<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>

<script type="text/javascript">

 	function gugudanFnc(){
		var num1 = 0;
		var num2 = 0;
		
		document.write('구구단'+'<br/>');		
		for (var i = 2; i <= 9; i++) {
			document.write(i + '단' + 
					'&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp');
		}
		document.write('<br/>');
		
		for (var i = 1; i <= 9; i++) {
			for (var j = 2; j <= 9; j++) {
				document.write(j + '*' + i + '=' + j*i);
				document.write('&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp');
			}
			document.write('<br/>');	
		}	
	}
 	
	gugudanFnc();
	 
	function gugudanparamFnc(num1, num2){

		document.write('<br/>' + '구구단'+'<br/>');		
		for (var i = num1; i <= num2; i++) {
			document.write(i + '단' + '<br/>');
			
			for (var j = 1; j <= 9; j++) {				
				document.write(i + '*' + j + '=' + '&nbsp&nbsp&nbsp' + (i*j));
				document.write('&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp');
			}
			document.write('<br/>');
		}	
	}
	
	gugudanparamFnc(3, 5);  
	
	
	
</script>
	
</head>
<body>
	

</body>
</html>