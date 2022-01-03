<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>web실습9</title>
</head>
<body>
	<%
		String name = request.getParameter("study");
		String url = null;
		
		if(name != null){
			if(name.equals("jsp") || name.equals("html")){
				if(name.equals("jsp")){
					url = "exam6.jsp?dan=7";
				}
				else{
					url = "/htmlexam/first.html";
				}%>
				<jsp:forward page="<%=url%>"/>
			<%
			}else{
				if(name.equals("javascript")){
					url = "http://www.w3schools.com/js/default.asp";
				}else if(name.equals("dom")){
					url = "http://www.w3schools.com/js/js_htmldom.asp";
				}else if(name.equals("ajax")){
					url = "http://www.w3schools.com/xml/ajax_intro.asp";
				}else if(name.equals("json")){
					url = "http://www.w3schools.com/js/js_json_intro.asp";
				}
				response.sendRedirect(url);
			}
		}
		else{%>
			<h2>study 라는 이름으로 전달된 쿼리가 존재하지 않습니다.</h2>			
		<% }%>
				

</body>
</html>
