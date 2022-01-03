package base;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String number = request.getParameter("number");
		int input_num = Integer.parseInt(number);
		Random random = new Random();
		int ran_num = random.nextInt(6) + 1; // 1에서 6
		String url = "";

		System.out.printf("전달된 값 : %d, 추출된 값 : %d\n", input_num, ran_num);

		if (input_num == ran_num) {
			url = "/htmlexam/success.html";
		} else {
			url = "/htmlexam/fail.html";
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);	
	}

}
