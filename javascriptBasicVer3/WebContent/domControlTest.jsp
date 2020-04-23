<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	window.onload = function() {
// 		createElement('div') -> 새로운 태그 생성
// 		(블럭태그는 보통 멀티태그이다 그래서 textnode(가장 아래단계)를 쓸 수 있다)
		var newDivTag = document.createElement('div');
		
		var newDivText = document.createTextNode('요소(태그) 생성연습');
		
// 		속성 설정
		newDivTag.setAttribute('id', 'theBox');
		newDivTag.setAttribute('style', 'height: 80px; background-color: silver;');
		
// 		선택 요소에 새로운 자식 요소를 추가
// 		선택 요소.appendChild(새태그); -> 선택태그에 새로운 자식 태그를 추가
		newDivTag.appendChild(newDivText);
		
// 		관계설정을 해줘야 화면에 나타난다, body를 부모화시킨다
		var bodyTag = document.getElementsByTagName('body')[0];
		
		bodyTag.appendChild(newDivTag);
	}
</script>
	
</head>
<body>

</body>
</html>