<!-- 
	2022.01.03(월)
	+ forward액션 태그
	+ 종료 태그 주의해라 
		jsp의 액션 태그의 구문은 xml기반으로 함
 -->
<%@ page contentType="text/html; charset=utf-8"   %>
<!DOCTYPE html>
<html>
<HEAD>
<meta charset="UTF-8">
<TITLE>forward 액션 태그를 이용한 분기 예제  </TITLE>
</HEAD>
<BODY>
<% 
	if(request.getParameter("type")==null || 
           request.getParameter("type").equals("admin") ){ %>
		<jsp:forward page="admin_new.jsp">
  			<jsp:param name="message" value="Hi! Administrator" />
  		</jsp:forward>
<% 
	} else  {%>
  		<jsp:forward page="user_new.jsp">
  			<!-- 종료 태그 주의 -->
  			<jsp:param name="message" value="Hi! User" />
  		</jsp:forward>
	<%} %> 
</BODY>
</HTML>
