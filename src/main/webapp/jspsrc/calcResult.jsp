<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연산 결과</title>
</head>
<body>
	<%
	int result = (int)request.getAttribute("result");
	 %>
	 <h1>연산 요청 결과</h1><hr>
	 <h2>결과 :  <font color="#ff6692"><%=result %></font></h2>
	 <a href = "/edu/htmlexam/calcForm.html">입력화면</a>
</body>
</html>