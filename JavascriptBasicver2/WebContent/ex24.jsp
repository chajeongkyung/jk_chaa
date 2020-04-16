<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   
<script type="text/javascript">

	/*2차원 배열_2*/
	var arr = [];
	
	for (var i = 0; i < 4; i++) {
		arr[i] = new Array();
	}
	
	var num = 1;
	for (var i = 0; i < arr.length; i++) {
		for (var n = 0; n < 5; n++) {		
			arr[i][n] = num + '&nbsp;';	
			num++;
		}		
	}
	 
	for (var i = 0; i < arr.length; i++) {
		for (var n = 0; n < arr[i].length; n++) {	
			document.write(arr[i][n]);				
		}
		document.write('<br/>');			
	}
		
	
</script>

</head>

<body>

   
   
</body>
</html>