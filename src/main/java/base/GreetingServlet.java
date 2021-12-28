package base;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		LocalDate currentDate = LocalDate.now(); // 현재 날짜 반환
		String input_name = request.getParameter("guestname");
		if (input_name == null) {
			input_name = "손님";
		}
		
		response.getWriter().append("<h2>"+ input_name + "! 반가워요..." + "오늘은 "
				+ currentDate.now().format(DateTimeFormatter.ofPattern("E").withLocale(Locale.forLanguageTag("ko")))
				+ "요일 입니다.</h2>");
		
		out.close();
	}

}
