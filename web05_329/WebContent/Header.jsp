<%@page import="spms.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- <%
	MemberDto memberDto = (MemberDto)session.getAttribute("memberDto");
%> --%>

<jsp:useBean
	id="memberDto"
	scope="session"
	class="spms.dto.MemberDto"
/>

<div style="background-color: #00008b; color: #ffffff;
	height: 20px; padding: 5px;">
	SPMS(Simple Project Manager System)
	
	<span style="float: right;">
		<%=memberDto.getName() %>
		<a style="color: white;" 
			href="<%=request.getContextPath()%>/auth/logout">
			로그아웃
		</a>
	</span>
</div>