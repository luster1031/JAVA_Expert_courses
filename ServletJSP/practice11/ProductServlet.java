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
		HttpSession session = request.getSession();
		
		if(session.getAttribute("product")==null) {
			session.setAttribute("product", new ProductVO());
		}
		
		ProductVO vo = (ProductVO)session.getAttribute("product");
		String param = request.getParameter("pid");
		if(param.equals("p001"))
			vo.setApple_count(1);
		else if(param.equals("p002"))
			vo.setBanana_count(1);
		else
			vo.setHala_count(1);
		
		request.getRequestDispatcher("/jspsrc/productView.jsp").forward(request, response);
	}


}
