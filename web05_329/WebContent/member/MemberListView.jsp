<%@page import="spms.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>회원목록</title>

</head>

<body>
	
	<jsp:include page="/Header.jsp"/>

	<h1>회원목록</h1>
	<p>
		<a href='add'>신규 회원</a>
	</p>
	
<!-- 		ArrayList<MemberDto> memberList = -->
<!-- 			(ArrayList<MemberDto>)request.getAttribute("memberList"); -->

<%-- 	<jsp:useBean 명명규칙 -- --%>
<%-- 		id="이름(변수명=객체 참조 변수 이름)" --%>
<%-- 		scope="범위(저장소=객체를 저장할 보관소 지정)" --%>
<%-- 		class="클래스명=자바 객체를 생성할 때 사용할 클래스 이름" --%>
<%-- 		type="타입명=참조 변수를 선언할 때 사용할 타입의 이름" --%>
<%-- 	/>	 --%>
	
	<jsp:useBean
		id="memberList"
		scope="request"
		class="java.util.ArrayList"
		type="java.util.ArrayList<spms.dto.MemberDto>"
	/>	
	
	<jsp:useBean 
		id='memberVo'
		scope="request"
		class="spms.dto.MemberDto"
	/>
	
	<jsp:setProperty property="password" name="memberVo"
		value="test"/>
	
	<%
		/* 확장형 for문 */
		for(MemberDto memberDto : memberList){
	%>
	
	<!-- 자바코드를 html에 나타내기 위한 코드 -->
	<%=memberDto.getNo() %>,
	여기는 비번이야: <%=memberVo.getPassword() %>
	<a href='update?no=<%=memberDto.getNo() %>'>
		<%=memberDto.getName() %>
	</a>,
	<%=memberDto.getEmail() %>,
	<%=memberDto.getCreateDate() %>
	<a href='delete?no=<%=memberDto.getNo() %>'>[삭제]</a>
	<br/>	
	<%
		}
	%>
	
	<jsp:include page="/Tail.jsp"/>
	
</body>

</html>