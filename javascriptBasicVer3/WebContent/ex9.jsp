<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>

<script type="text/javascript">

	function confirmId() {
		
		var result = confirm('이걸로 하시겠어요?');
		
		var txtObj = document.getElementById('inputId');
		
		if (result) {
			txtObj.style.border = '1px solid red';
		}else{
			txtObj.value = '';
		}
	}
	
	window.onload = function () {
		var inputId = prompt('아이디를 입력하세요', '');
		
		var txtObj = document.getElementById('inputId');
		txtObj.value = inputId;				
		
	}
	
</script>
</head>
<!-- 그냥 화면 뜨면 게임 케릭터 이름 적어주라고 뜬다 이름 적어주면 text에 뜬다 -->
<!-- 버튼 클릭하면 게임 아이디 확정하시겠습니까?
뜨고 확인 누루면 text 경계선 적용 red 
만약    취소 누르면 text 내용 비운다 -->
<body>
	<input id='inputId' type="text" value="">
	<input type="button" onclick="confirmId();" value="버튼">
</body>
</html>