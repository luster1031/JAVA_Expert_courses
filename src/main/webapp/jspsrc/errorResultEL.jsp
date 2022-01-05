<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>errorPage_EL</title>
</head>
<body>
	<%
	pageContext.setAttribute("msg", (String)request.getAttribute("errormsg"));
	 %>
	 <h1>요청을 처리하는 동안 오류가 발생했어요..</h1>
	 <h2>오류의 원인 : <font color="#ff6692">${msg}</font></h2>
	  <a href = "/edu/htmlexam/calcForm.html">입력화면</a>
</body>
</html>