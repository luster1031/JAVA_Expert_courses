<!-- 
	2022.01.03(월)
	+ 내장객체
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP의 내장 객체들</title>
</head>
<body>
	<h2>JSP의 내장 객체들 점검</h2>

	<h3>[ request ]</h3>
	<!-- 
		request.getMethod() : 무슨 형식으로 보낸는지
		request.getHeader("user-agent") : 클라이언트가 어떤 종류의 브라우저인지, 모바일인지 pc인지
	 -->
	getMethod() : <%=request.getMethod()%><br> 	
	getRequestURI() : <%=request.getRequestURI()%><br>
	getHeader("user-agent") : <%=request.getHeader("user-agent")%><br>
	
	
	<!-- 클라이언트 출력, out사용할 때 수행문 태그 사용해야한다.  -->
	<h3>[ out ]</h3>
	<%
	out.print("<h4>out내장 객체로 출력!!</h4>");
	%>
	
	<!-- 
		jsp는 세션객체 생성이 기본이다. 
		서블릿으로 바뀔 때 들어감 -->
	<h3>[ session ]</h3>
	getId() : <%=session.getId()%><br> 
	getCreationTime() : <%=new Date(session.getCreationTime())%><br>
	
	
	<!-- 
		8k바이트 넘으면 다시 채워짐
		한번에 보내는 최대가 8kbte
	 -->
	<h3>[ response ]</h3>
	getStatus() :<%=response.getStatus()%><br> 
	getBufferSize() : <%=response.getBufferSize()%><br> 
	getContentType() :<%=response.getContentType()%>
	<%
	response.addCookie(new Cookie("myCookie", "myValue")); //	쿠키정보를 같이 응답하고 싶을 때
	%>
	
	
	<!-- 
		tomcat 은 web프로젝이라는 것을 모름
			edu를 하나의 서블릿 컨텍스트 객체라고 생각

		web 프로젝이라는 것을 이클립스에서 정의한 것
		application.getServerInfo() : WAS의 이름, 버전
	 -->
	<h3>[ application ]</h3>
	getContextPath() : <%=application.getContextPath()%><br> 
	getServerInfo() : <%=application.getServerInfo()%><br> 
	getMajorVersion() : <%=application.getMajorVersion()%><br>
	
	
	<!-- 최상의 폴더 -->
	<H4>Web Application(/edu) 디렉토리의 파일 리스트</H4>
	<%
	java.util.Set<String> list = application.getResourcePaths("/");
	if (list != null) {
		Object obj[] = list.toArray();
		for (int i = 0; i < obj.length; i++) {
			out.print(obj[i] + ", ");
		}
	}
	%>
</body>
</html>