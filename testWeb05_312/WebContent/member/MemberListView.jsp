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
		<a href='./add'>신규 회원</a>
	</p>
	
	<!-- 리턴값이 object이므로 형변환을 해줘야한다 -->
	<%
		ArrayList<MemberDto> memberList =
			(ArrayList<MemberDto>)request.getAttribute("memberList");
		
		/* 확장형 for문 */
		for(MemberDto memberDto : memberList){
	%>
	
	<!-- 자바코드를 html에 나타내기 위한 코드 -->
	<%=memberDto.getNo() %>,
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