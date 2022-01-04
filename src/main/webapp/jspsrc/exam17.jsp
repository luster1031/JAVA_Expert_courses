<!-- 
	2022.01.03/04
	[bean]
	Dokdo 폰트 설정
	import = "jspbean.Today"
	어떤 클래스든 들고 올 수 있음
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="jspbean.Today"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>폰트 끌어오기</title>
<link href="https://fonts.googleapis.com/css?family=Dokdo:400"
	rel="stylesheet">
</head>
<body>
	<h1 style="font-family: 'Dokdo'">
		지금은 <%Today obj = new Today();%>
		<%=obj.getYear()%>년
		<%=obj.getMonth()%>월
		<%=obj.getDate()%>일
		<%=obj.getHour()%>시
		<%=obj.getMinute()%>분 입니당
	</h1>
</body>
</html>