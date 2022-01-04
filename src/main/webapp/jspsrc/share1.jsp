<!-- 
	2022.01.04
	[request 스코프]
	request객체 
	getAttribute
	ShareTestServlet1.java
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="vo.CountVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>서블릿이 전달한 객체(request)</h2>
	<hr>
	<%
	//	request.getAttribute로 objreq받아오기
	CountVO vo = (CountVO) request.getAttribute("objreq");
	if (vo != null) {
	%>
		추출된 값 :
		<%=vo.getNumber()%><br>
	<%
	} else {	
	// shareTestServlet1.java의 request.setAttribute("objreq", vo);가 없으면 null
	%>	
		추출된 객체가 없슈!!
	<%
	}
	%>
</body>
</html>



