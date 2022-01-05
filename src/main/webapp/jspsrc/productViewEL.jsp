<%@page import="vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과_EL</title>
<style type="text/css">
.jbGrad {
         background: linear-gradient( to right, yellow, red, purple, blue );
         text-decoration-line: none;
         color: white;
         }
</style>
</head>
<body>
	<h1>선택된 상품 정보는 다음과 같습니다.</h1><hr>
	<%
	request.setAttribute("vo", (ProductVO)session.getAttribute("product2"));
	%>
	
	선택된 사과의 개수 : ${vo.apple_count}<br>
	선택된 바나나의 개수 :  ${vo.banana_count}<br>
	선택된 한라봉의 개수 : ${vo.hala_count}<br><hr>
	<!-- header.referer : 훨씬 효율적 -->
	<a class = "jbGrad" href="${header.referer}">상품선택화면</a>
</body>
</html>