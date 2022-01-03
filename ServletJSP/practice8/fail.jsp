<%@ page import="java.util.Date" import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실패(fail)</title>
</head>
<body>
<% 
	Date nowDate = new Date(); 
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH시 mm분");

%>
	<h2><%=simpleDateFormat.format(nowDate)%>에 실패~~ 아쉽아쉽</h2><hr>
	
	<form>
		<img src="/edu/images/fail.jpg" width = 300 /> <br>
		<a href = "/edu/htmlexam/lottoForm2.html">로또 응모</a>
	</form>
</body>
</html>