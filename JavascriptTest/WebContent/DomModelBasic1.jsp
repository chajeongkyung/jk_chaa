<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>웹 문서구조</title>
		
		<!-- <p style="border: 1px solid black;" onclick="clickFnc();">버튼</p>
			
		구조는 변경하지 않는다
		 태그는 추가가능 
		 아이디는 만들지x
		
		1버튼 클릭시 첫번째 h1 배경색 변경
		2버튼 클릭시 두번째 div p태그가 바뀐다 -->
		
		<script type="text/javascript">	
		
		function clickFnc() {			
			var divObj = document.getElementById("firstExam");
			var h1Obj = divObj.getElementsByTagName("h1")[0];
			
			h1Obj.style.backgroundColor="gray";
		}
		
		function clickFnc2() {			
			var divObj = document.getElementsByTagName("div")[1];
			var pObjList = divObj.getElementsByTagName("p");
			
			for (var i = 0; i < pObjList.length; i++) {
				pObjList[i].style.backgroundColor="pink";
			}
		}
		
		</script>
		
	</head>
	<body>		
		<div id="firstExam">
			<h1>DOM(Document Object Model)</h1>
			<p>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
		</div>
		
		<div>
			<h1>DOM(Document Object Model)2</h1>
			<p>문서의 각 요소(객체)들을 구조화한 것입니다.2</p>
			<p>문서의 각 요소(객체)들을 구조화한 것입니다.3</p>
		</div>

		<div>
			<button style="border: 1px solid black;"
			 	onclick="clickFnc();">
					 첫번째 문제버튼
			 </button>
			<button style="border: 1px solid black;" 
				onclick="clickFnc2();">
					두번째 문제버튼
			</button>
		</div>
	
	</body>
</html>