<!-- 
	2022.01.03
	Web 실습 8
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성공!(success!)</title>
</head>
<body>
	<%@ include file = "dataformat.jspf" %>
	<h2><%=simpleDateFormat.format(nowDate)%>에 당첨~~~ 추카추카</h2><hr>
	<form>
		<img src="/edu/images/success.jpg" /> <br> <a
			href="/edu/htmlexam/lottoForm2.html"></a>
	</form>
</body>
</html>