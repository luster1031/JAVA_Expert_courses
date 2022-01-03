<!-- 
	2022.01.03(월)
	+ include 액션 : 실행 되는 건 별개로 (결과만 포함)
		서블릿 두개 생김
		a 실행하다가 중지시켜서 b 실행시켜 결과를 포함시킴
	+ include 지시자 : 
		서블릿 소스 하나 만들어짐
 -->
<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<HTML>
<HEAD>
<META charset="UTF-8">
<TITLE>INCLUDE 액션태그 예제</TITLE>
</HEAD>
<BODY>
	<H3>INCLUDE 액션태그 예제</H3>
	<H4>각 나라의 감사 인사말입니다.</H4>
	
	<P>
		한국어 : 
		<jsp:include page="greeting.jsp">
		   <jsp:param name="country" value="korea" />
		</jsp:include>
		
	</P>
	
	<P>
		영어 :
		<jsp:include page="greeting.jsp">
		   <jsp:param name="country" value="english" />
		</jsp:include>
	</P>
	
	<P>
		일본어 :
		<jsp:include page="greeting.jsp">
		   <jsp:param name="country" value="japan" />
		</jsp:include>
	</P>
</BODY>
</HTML>





