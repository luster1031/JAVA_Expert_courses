<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="vo.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보_EL</title>
</head>
<body>
	<%
	pageContext.setAttribute("vo", request.getAttribute("memberinfo2"));
	%>
	<h1>회원 정보</h1>
	<hr>
	<ul>
		<!-- ${requestScope.memberinfo2.name}도 가능 -->
		<li>회원 이름 : ${vo.name}</li>
		<li>회원 계정 : ${vo.account}</li>
		<li>회원 암호 : ${vo.passwd}</li>
		<li>회원 전화번호 : ${vo.number}</li>
	</ul>


</body>
</html>