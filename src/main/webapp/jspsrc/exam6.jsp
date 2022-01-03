<!-- 
	2022.01.03(월)
	+ 쿼리문 안 주면 numberformatException나옴
	+ 구구단 두번 출력 -> 차이 : 반복문을 표현식 OR 수행문
	+ for문 같은 긴거는 수행문 태그로
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP로 구현한 구구단</title> 
</head>
<body>
<h2>JSP로 구현한 구구단</h2>
 <%
	 int dan= Integer.parseInt(request.getParameter("dan"));
	 if (dan <= 9) {
	 	for (int i=1;i<=9;i++){
 %>
 		<!-- 출력을 표현식 태그로 -->
		 <%= dan %> x <%=i %> = <%=dan*i%><br>
	<%	
		}
 	%>
 
 	<hr>

 <%
 		// 수행문 태그로 
		for (int i=1;i<=9;i++){
			out.print(dan + " x " + i + " = "  + dan*i + "<br>");	
		}
 	}else {
 %>
		<h3 style="color:red">1에서 9사이의 값을 입력해 주세요..</h3>
 <%	
	}
 %>
</body>
</html>





