package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.ProductVO;

@WebServlet("/productservlet10")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();	//	세션객체 참조값 리턴
													//	없으면 새로만들어서 리턴
		
		if(session.getAttribute("product2")==null) {	//	데이터 값 보관할 방에 대한 객체 등록
			session.setAttribute("product2", new ProductVO());
		}
		
		ProductVO vo = (ProductVO)session.getAttribute("product2");	//	참조값 꺼내와서, vo객체에 
		String param = request.getParameter("pid");
		if(param.equals("p001"))
			vo.setApple_count(1);
		else if(param.equals("p002"))
			vo.setBanana_count(1);
		else
			vo.setHala_count(1);
		
		request.getRequestDispatcher("/jspsrc/productViewEL.jsp").forward(request, response);
	}


}
