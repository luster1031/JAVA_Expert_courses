<!-- 
	2021.12.30
	member변수, local 변수
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 실습 연습 2</title>
</head>
<body>
	<%! int member_v = 0;%>
	<%
		int local_v = 0;
		member_v += 10;
		local_v += 10;
	%>
	<h1>JSP의 멤버 변수와 지역 변수</h1>
	<hr>
	<ul>
		<li>멤버 변수 : <%= member_v %></li>
		<li>로컬 변수 : <%= local_v %></li>
	</ul>
</body>
</html>