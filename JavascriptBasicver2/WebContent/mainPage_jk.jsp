<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		#grayBlock {
			margin: auto;
			border: 1px solid #666666;
			border-collapse: collapse;
			background-color: #666666;
			width: 866px;
			height: 50px;
			margin-top: 100px;			
		}		
		#blueBtn {
			margin-top: 7px;
			margin-left: 20px;
			border: 1px solid #5BC0DE;
			border-collapse: collapse;
			background-color: #5BC0DE;
			width: 71px;
			height: 34px;
			color: white;
			font-size: 14px;
		}
		#loginBlock {
			margin: auto;
			margin-top: 100px;
			padding-left: 60px;
			border: 2px solid #C0C0C0;
			border-collapse: collapse;
			background-color: white;
			width: 396px;
			height: 256px;		
		}
		.inputBox input {
			border: 1px solid black;
			border-collapse: collapse;
			background-color: white;
			width: 192px;
			height: 41px;
			padding: 3px;			
		}
		.inputBox {
			float: left;
		}
		
		#orangeBtn {
			margin-top: 40px;
			border: 1px solid #CC9933;
			border-collapse: collapse;
			background-color: #CC9933;
			width: 99px;
			height: 111px;
			color: white;
		}
		.btnBox input {
			margin-top:30px;
			margin-right: 14px;
			border: 1px solid black;
			border-collapse: collapse;
			background-color: #CCCCCC;
			width: 104px;
			height: 31px;
		}
		.btnBox {
			clear: left;
		}
	</style>
	
</head>
<body>
	<div style="border:1px solid black; width: 1024px; height: 768px;">
		<div id='grayBlock'>
			<input id='blueBtn' type="button" value="로그인">
		</div>
		<div id='loginBlock'>
			<div class='inputBox'>
				<div>
					<input style="margin-top: 40px;" type="text" value="아이디"> 
				</div>
				<div>
					<input style="margin-top: 15px;" type="text" value="비밀번호"> 
				</div>
			</div>
			<div style="float:left; margin-left: 20px;">
				<input id='orangeBtn' type="button" value="로그인">
			</div>
			<div class="btnBox">
				<input type="button" value="회원가입">
				<input type="button" value="아이디 찾기">
				<input type="button" value="비밀번호 찾기">
			</div>
		</div>
	</div>

</body>


<script type="text/javascript">
	
</script>
</html>