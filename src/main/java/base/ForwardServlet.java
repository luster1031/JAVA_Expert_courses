package base;
/*
 * 2021.12.29
 * Forward 
 * */
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("FowardServlet 수행 시작");		
		
		/*
			* forward대상에 대한 path정보 전달
			* /htmlexam/first.html에 정보 전달하겠어!
			* /edu붙이면 안됨
			*  
		 */
		
		//	동일한 자원안에서 요청할 수 있다고 /edu/htmlexam/first.html
		//	다른 프로젝트는 forward대상으로 붙일 수 없다.
		RequestDispatcher rd = request.getRequestDispatcher("/htmlexam/first.html");	// 컨텍스트패스 이후 부분을 줘야
		//RequestDispatcher rd = request.getRequestDispatcher("http://www.naver.com/");	// 컨텍스트패스 이후 부분을 줘야	
		
		rd.forward(request, response);	
		System.out.println("FowardServlet 수행 종료");		
		
	}
}





