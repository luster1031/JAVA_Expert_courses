package base;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");	//	응답시, 형식이 뭔지 알리는 것
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");	// 쿼리 문자 추출 시, 한글이 추출 잘 되게
		String name = request.getParameter("name");
		String forest = request.getParameter("forest");
		String[] add = request.getParameterValues("add");

		out.print("<h2>" + name+"님의 예약내용:</h2><hr>");
		out.print("<ul><li> 휴양림 : ");
		if (forest == null) {
			out.print("휴양림을 선택하지 않으셨습니다.");
		} else {
			out.print(forest);
		}
		out.print("</li>");
		out.print("<li> 추가 요청 사항 : ");
		if (add == null) {
			out.print("추가 요청 사항이 없습니다.");
		} else {
			for (int i = 0; i < add.length-1; ++i) {
				out.print(add[i] + ",");
			out.print(add[add.length-1]);
			}
		}
		
		String[] day = request.getParameter("Reservation").split("-");
		/*
			LocalDate date = LocalDate.parse(request.getParameter("date"));
			out.printf("<li>예약 날짜 : %1$tY년 %1$tm월 %1$td일</ul>", date);
			1$ : 첫번째 아규먼트를 여기에 반영하겠다. 
		*/
		out.printf("<li>예약 날짜 : %s년 %s월 %s일</li></ul>" , day[0], day[1], day[2]);
		out.close();
	}

}
