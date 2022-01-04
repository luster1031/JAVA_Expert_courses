<!-- 
	2022.01.03/04
	[bean]
	+ Gamja+Flower 폰트 설정
	+ useBean 
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Gamja+Flower:400"
	rel="stylesheet">
</head>
<body>
	<h1 style="font-family: 'Gamja Flower'">
		지금은
		<!-- 
			아규먼트 안 받는 얘만 호출함, 
			태그로 객체 생성 
		-->
		<jsp:useBean id="obj" class="jspbean.Today" />	<!-- scope속성이 생략되면 page -->
		<jsp:getProperty name="obj" property="year" />년
		<jsp:getProperty name="obj" property="month" />월
		<jsp:getProperty name="obj" property="date" />일
		<jsp:getProperty name="obj" property="hour" />시
		<jsp:getProperty name="obj" property="minute" />분 입니당
	</h1>
</body>
</html>