<!-- 
	2021.12.30
	표현식 태그	
-->
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 실습 연습 3</title>
</head>
<body>
	<h1>표현식 태그</h1>
	<hr>
	<% int num = 10;%>
	<ul>
		<li><%= 100%></li>
		<li><%= num%></li>
		<li><%= ++num%></li>
		<li><%= num*2%></li>
		<li><%= "가나다".length()%></li>
		<li><%= num%2 == 0%></li>
		<li><%= request.getParameter("stname")%></li>
		<li><%= new Date(session.getCreationTime()) %>
		<li><%= application.getServerInfo()%></li>
		<li><%= application.getContextPath()%></li>
	</ul>
</body>
</html>