<!-- 
	EL관련 2
	2022.01.05
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 테스트</title>
</head>
<body>
	<h2>EL의 Query 문자열 추출</h2>
	<hr>
		<!-- 표현식 태그는 null 주지만, EL태그는 없으면 추출 안 하고 비어둔다. -->
	전달된 메시지의 존재 여부 : ${ !empty param.message }<hr> <!-- 논리 부정식 사용 -->
	전달된 메시지의 내용은 ${param.message} 입니다.<br>	
	전달된 메시지의 내용은 ${param["message"]} 입니다.<br>	<!-- 문자열 형식으로 이름 줌 -->
	전달된 메시지의 내용은 <%= request.getParameter("message") %> 입니다.<br>
</body>
</html>.