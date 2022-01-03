<%@ page import="java.util.Date" import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성공!(success!)</title>
</head>
<body>
<% 
	Date nowDate = new Date(); 
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH시 mm분");

%>
	<h2><%=simpleDateFormat.format(nowDate)%>에 당첨~~~ 추카추카</h2><hr>
	<form>
		<img src="/edu/images/success.jpg" /> <br> <a
			href="/edu/htmlexam/lottoForm.html"></a>
	</form>
</body>
</html>