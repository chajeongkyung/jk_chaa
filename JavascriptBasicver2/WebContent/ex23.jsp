<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   
<script type="text/javascript">

	/*2차원 배열*/
	var arr = [];	
	arr[0] = new Array();
	
	for (var i = 0; i < arr.length; i++) {
		for (var n = 0; n < 3; n++) {		
			arr[i][n] = n;		
		}		
	}
	
	for (var i = 0; i < arr.length; i++) {
		for (var n = 0; n < 3; n++) {	
			document.write(arr[i][n] + ',' + arr[i][n] + ' ');				
		}		
	}
		
	/* var arr = [[],[]];
	
	for (var i = 0; i < 2; i++) {
		for (var n = 0; n < 3; n++) {
			arr[i][n] = n;
		}
	}
	
	for (var i = 0; i < 2; i++) {
		for (var n = 0; n < 3; n++) {
			document.write(arr[i][n]);
		}
		document.write('<br/>');		
	} */
	
</script>

</head>

<body>

   
   
</body>
</html>