<!-- 
	2022.01.03(월)
	+ exam8.jsp에 사용됨
	+ page isErrorPage = "true"줘야 exception 객체가 사용됨
	+ 	기본값 : false : exception 내장 객체 사용 할 수 없음
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>errorPage</title>
</head>
<body style="text-align:center">
	<h2>오류 발생했어욤ㅠㅠ</h2>
	<h3>빠른시일내에 복구하겠습니다...</h3>
	<img src="error.jpg">
	<%	
	    String msg = "오류 원인 : " + exception;	
		System.out.println("----------------------------------------");
		System.out.println(msg);
		System.out.println("----------------------------------------");	
		exception.printStackTrace();
	%>
</body>
</html>






