<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조</title>

<script type="text/javascript">

	function ranImageFnc() {
		var ranNum1 =(Math.ceil(Math.random()*3));
		
		document.getElementsByTagName('img')[0].src = 
			'./images/img'+ ranNum1 +'.jpg';		
	}
	
</script>

</head>


<body>
	<img alt = '랜덤이미지' src="./images/img1.jpg">
	
	<div onclick="ranImageFnc();" style="width: 200px; text-align: center;
		border: 1px solid black;">
		<button>
				랜덤이미지 버튼
		</button>
	</div>
	
</body>

</html>





