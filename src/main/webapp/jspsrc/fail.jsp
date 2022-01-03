<!-- 
	2022.01.03
	Web 실습 8
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실패(fail)</title>
</head>
<body>
	<%@ include file = "dataformat.jspf" %>
	<h2><%=simpleDateFormat.format(nowDate)%>에 실패~~ 아쉽아쉽</h2><hr>
	
	<form>
		<img src="/edu/images/fail.jpg" width = 300 /> <br>
		<a href = "/edu/htmlexam/lottoForm2.html">로또 응모</a>
	</form>
</body>
</html>