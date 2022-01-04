package base;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/lotto2")
public class LottoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String number = request.getParameter("number");
		int input_num = Integer.parseInt(number);
		Random random = new Random();
		int ran_num = random.nextInt(6) + 1; // 1에서 6
		String url = "";
		int[] data = null;
		RequestDispatcher rd;
		
		HttpSession session = request.getSession();		// 세션 객체 만들어 온다. 
		if (session.getAttribute("number") == null)
			session.setAttribute("number", new int[1]); // 데이터를 저장할 방을 등록
		data = (int[]) session.getAttribute("number");
		
		if (data[0] < 3) {
			if (number != null)
				System.out.printf("전달된 값 : %d, 추출된 값 : %d\n", input_num, ran_num);
			if (input_num == ran_num) {
				url = "/htmlexam/success.html";
				data[0] = 3;
			} else {
				url = "/htmlexam/fail.html";
			}
			data[0]++;
		}
		else {
			url = "/htmlexam/impossible.html";
		}
		rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
