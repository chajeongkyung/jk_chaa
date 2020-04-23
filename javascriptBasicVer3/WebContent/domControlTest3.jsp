<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
</style>

<script type="text/javascript">
	window.onload = function() {
		//태그생성
		var newDivTag = document.createElement('div');
		var newDivTag2 = document.createElement('div');
		var newBtn = document.createElement('button');
		var newInput = document.createElement('input');
		
		var newDivText = document.createTextNode('요소(태그) 생성 연습');
		var newBtnText = document.createTextNode('버튼1');
		
		//속성 추가
		newDivTag.setAttribute('id', 'theBox');
		newDivTag.setAttribute('style', 'height: 80px; background-color: silver;');		
		
		newBtn.setAttribute('id', 'btn1');
		newInput.setAttribute('type', 'button');
		newInput.setAttribute('value', '버튼2');
		
		//관계 설정
		newDivTag.appendChild(newDivText);
		newDivTag.appendChild(newDivTag2);
		newDivTag2.appendChild(newBtn);
		newBtn.appendChild(newBtnText);
		newDivTag2.appendChild(newInput);
		
		//body에 출력
		var bodyTag = document.getElementsByTagName('body')[0];
		
		bodyTag.appendChild(newDivTag);		
		
// 		window.onload = function(){
		      
// 		      /* 첫번째 div */
// 		      var firstDivTag = document.createElement('div');
// 		      var firstDivText = document.createTextNode('요소(태그) 생성 연습');

// 		      firstDivTag.setAttribute('id','theBox');
// 		      firstDivTag.setAttribute('style','background-color: silver; height:80px;');
		      
// 		      firstDivTag.appendChild(firstDivText);
		      
// 		      /* 두번째 div */
// 		      var secondDivTag = document.createElement('div');
		      
// 		      firstDivTag.appendChild(secondDivTag);
		      
// 		      /* 자식div의 자식btn, input태그 */
// 		      var childBtnTag = document.createElement('button');
// 		      var childInputTag = document.createElement('input');
		      
// 		      //버튼태그의 속성 추가 
// 		      childBtnTag.setAttribute('id','btn1');
// 		      //버튼태그의 텍스트 추가 
// 		      var childBtnText = document.createTextNode('버튼1');
// 		      childBtnTag.appendChild(childBtnText)
		      
// 		      //인풋태그의 속성 추가 
// 		      childInputTag.setAttribute('type','button');
// 		      childInputTag.setAttribute('value','버튼2');
		      
// 		      //btn, input태그 두번째div태그에 자식으로 연결
// 		      secondDivTag.appendChild(childBtnTag);
// 		      secondDivTag.appendChild(childInputTag);
		      
// 		      /* 바디태그에 최상위div 추가 */
// 		      var bodyTag = document.getElementsByTagName('body')[0];
// 		      bodyTag.appendChild(firstDivTag);
		      
// 		   }
	} 
	
</script>

</head>

<body>
<!--    <div id='theBox' style="background-color: silver; height: 80px;"> -->
<!--       요소(태그) 생성 연습 -->
<!--       <div> -->
<!--          <button id='btn1'>버튼1</button> -->
<!--          <input type="button" value="버튼2"> -->
<!--       </div> -->
<!--    </div> -->
</body>
</html>

