<%@ page import="java.util.*" import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>impossible</title>
</head>
<body>
<% 
	Date nowDate = new Date(); 
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH시 mm분");
	Calendar cal = Calendar.getInstance();
	cal.setTime(nowDate);
	cal.add(Calendar.MINUTE, 30);
%>
	<h1 style="color:red" >더 이상 응모할 수 없어요… 
		<%=simpleDateFormat.format(cal.getTime())%>
		이후에 브라우저를 재기동한 후에는 가능하답니다.</h1>
	<br><img src="/edu/images/Wmt.jpg" width = 300/>
</body>
</html>