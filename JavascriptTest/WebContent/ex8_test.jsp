<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조</title>
</head>
<body>
   <div id='firstExam'>
      <div> <!-- div에 서로다른 경계선준다 -->
         <h1>DOM(Document Object Model)</h1>
         <p>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
      </div>

      <div> <!-- 세개의 태그명을 띄운다 -->
         <h1>DOM(Document Object Model)2</h1>
         <p>문서의 각 요소(객체)들을 구조화한 것입니다.2</p>
         <p>문서의 각 요소(객체)들을 구조화한 것입니다.3</p>
      </div>

      <div>
         <button onclick="borderFnc();" style="border: 1px solid black;">첫번째 문제 버튼</button>
         <button onclick="showTagFnc();" style="border: 1px solid black;">두번째 문제 버튼</button>
      </div>
   </div>
</body>

<script type="text/javascript">	
	<!-- div에 서로다른 경계선준다 -->
	function borderFnc() {			
		var divObjList = document.getElementById("firstExam").children;
		
		divObjList[0].style.border="2px solid gray";
		divObjList[1].style.border="2px solid green";
		divObjList[2].style.border="2px solid black";
	}
	
	<!-- 세개의 태그명을 띄운다 -->
	
	function showTagFnc() {			
		var divObjList = document.getElementById("firstExam").children;
	
		for (var i = 0; i < divObjList.length; i++) {
			alert(divObjList[1].children[i].tagName);
		}
	}
	
</script>

</html>





