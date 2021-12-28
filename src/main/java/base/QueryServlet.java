package base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/* 
 * queryservelttest.html 의 submit한 것이 전달 됨
 * */
@WebServlet("/query")
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String p1 = request.getParameter("p1");
		int p2 = Integer.parseInt(request.getParameter("p2"));
		String p3[] = request.getParameterValues("p3");	//	체크 박스를 통해서 전달 받음
		// 아무것도 선택 안 하면 비어있는 배열 리턴함
		out.print("<ul>");
		out.print("<li>p1 : "+ p1 +"</li>");
		out.print("<li>p2 : "+ p2 +"</li>");
		for(int i=0; i < p3.length; i++)
			out.print("<li>p3["+i+"] : "+ p3[i] +"</li>");
		out.print("</ul>");
		// 하이퍼 링크 
		out.print("<a href = '/edu/htmlexam/queryservlettest.html'>입력화면으로</a>");
		out.close();		
	}
}




