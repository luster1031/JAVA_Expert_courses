package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String oper = request.getParameter("oper");
		int result = 0;
		if(oper.equals("/") && num2==0) {
			request.setAttribute("errormsg", "나눗셈 연산시 두 번째 숫자는 0일 수 없습니다!!");
			request.getRequestDispatcher("/jspsrc/errorResultEL.jsp").forward(request, response);
		}
		else {
			switch (oper) {
			case "*":
				result = num1 * num2;break;
			case "-":
				result = num1 - num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "+":
				result = num1 + num2;
				break;
			default:
				break;
			}
			request.setAttribute("result", result);
			request.getRequestDispatcher("/jspsrc/calcResultEL.jsp").forward(request, response);
		}
	}
}
