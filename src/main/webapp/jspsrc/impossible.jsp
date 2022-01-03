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
<title>impossible</title>
</head>
<body>
<%@ include file = "dataformat.jspf" %>
<% 
	Calendar cal = Calendar.getInstance();	//	자동으로 현재 시점으로
	cal.setTime(nowDate);	// setTime 안 해줘도 됨
	cal.add(Calendar.MINUTE, 30);
%>
	<h1 style="color:red" >더 이상 응모할 수 없어요… 
		<%=simpleDateFormat.format(cal.getTime())%>
		이후에 브라우저를 재기동한 후에는 가능하답니다.</h1>
	<br><img src="/edu/images/Wmt.jpg" width = 300/>
</body>
</html>