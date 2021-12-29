package base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/move")
public class MoveServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String name = request.getParameter("action");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String url = "";
		if(name == null) {
			out.print("<h2>전달된 쿼리 문자열이 없어서 MoveServlet이 직접 응답합니당..</h2>");
		}else {
			if(name.equals("naver")) {
				url = "http://www.naver.com/";	// 컨텍스트패스 이후 부분을 줘야
			}
			else if(name.equals("daum")){
				url = "http://www.daum.net/";	// 컨텍스트패스 이후 부분을 줘야
			}
			else if(name.equals("google")) {
				url = "https://www.google.com/";	// 컨텍스트패스 이후 부분을 줘야
			}
			response.sendRedirect(url);
		}
		out.close();
	}
}