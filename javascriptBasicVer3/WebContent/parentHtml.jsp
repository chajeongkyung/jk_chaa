<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	//1.어떤 페이지를 띄울까, 2.타이틀, 3번째부터는 옵션영역
// 		window.open("childHtml.jsp","naver","width=300px, height=400px, left=600px, top=20px, scrollbars=no, toolbar=no, location=no");

	window.onload = function() {
		
		var btnObj = document.getElementsByTagName('button')[0];
		
		btnObj.addEventListener('click', popupFnc);
		
	}

	function popupFnc() {
		
		window.open("./childHtml.jsp",
				"naver",
				"width:200px, height:200px")
		
	}
	</script>
	
</head>
<body>
	<button>날 클릭하면 팝업창이 떠</button>

</body>
</html>