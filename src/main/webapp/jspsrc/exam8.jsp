<!-- 
	2022.01.03(월)
	+ length() : NullPointerException오류남 ( 500에러 )
	+ errpage : 실행 오류가 나면 jsp를 대신 응답해라 
		servlet으로 변환할 때 에러는 안 됨	
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   errorPage="errorPage.jsp"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>errorPage 속성 테스트</h2>
<hr>
<%
     String name = request.getParameter("guestName"); //	guestName 대소문자 구분함
%>

	<h3>당신의 이름은 <%= name %> 이고 이름의 길이는
           <%= name.length() %> 입니다.</h3>
</body>
</html>















