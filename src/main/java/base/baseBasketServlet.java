package base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basket")
public class baseBasketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String contentType = "text/html; charset=utf-8";
		response.setContentType(contentType);
		PrintWriter out = response.getWriter();
//		request.setCharacterEncoding("UTF-8"); -> get방식

		String name = request.getParameter("pid");
		int imglndex = Integer.parseInt(name.substring(1,4));
		
		out.print("<h2>선택한 상품 : " + name + "</h2>");
		String filename = "http://localhost:8080/edu/images/image" + imglndex + ".png";
		out.print("<img src=\"" + filename + "\" width = 200>");

//		out.print("<br><a href='/edu/htmlexam/productlog.html'>" + "상품 선택 화면</a>");
		out.print("<br><a href ='" +request.getHeader("referer") +"'>상품선택화면</a>");
	}

}