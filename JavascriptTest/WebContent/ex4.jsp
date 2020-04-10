<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>

	<script type="text/javascript">
	
		/* function forFnc() {
			for (var i = 10; i >= 1; i--) {
				if (i % 2 ==0) {
					document.write(i);
					document.write('<br/>');
				}
			}
		}
		
		forFnc(); */
		
		/*
			whileFuc는 10에서부터 짝수면 출력한다
		*/
		
		function whileFnc() {			
			var num = 10;
			
			while(num >= 1){		
				if (num % 2 == 0) {
					document.write(num);
					document.write('<br/>');				
				}
				num--;
			}
		}
	
		
		whileFnc();
		
		
		
	</script>
	
</head>
<body>
	
</body>
</html>