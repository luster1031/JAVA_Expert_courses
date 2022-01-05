/*
 * visitor테이블을 활용한 방명록 웹 프로그램 작성
 * - crud
 * 
 * model
 * 	- VisitorVO.java
 * 	- VisitorDBServlet2.java
 * 	- MySQL.java
 *  - visitorDAO.java
 *  
 * controller
 * 	- VisitorDBservlet2.java
 * 
 * view
	- visitorView.jsp
	- visitorUpdateView.jsp
 * */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.VisitorDAO;
import vo.VisitorVO;

@WebServlet("/visitordb2")
public class VisitorDBServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String id = request.getParameter("id");
		String action = request.getParameter("action");
		VisitorDAO dao = new VisitorDAO();
		String target = "/jspsrc/visitorView.jsp";
		if(action != null && action.equals("delete")) {
			boolean result = dao.d(Integer.parseInt(id));
			if(result) {
				request.setAttribute("msg", "글이 성공적으로 삭제되었어요!!");
			}else {
				request.setAttribute("msg", "글 삭제를 실패했어요!!");
			}
		}else if(action != null && action.equals("update")) {
			VisitorVO vo = dao.rOne(Integer.parseInt(id));
			request.setAttribute("updatevo", vo);
			target = "/jspsrc/visitorUpdateView.jsp";
		}else {		//	전체 리스트 출력
			List<VisitorVO> list = dao.r();
			for(VisitorVO vo : list) {
				System.out.println(vo.getMemo());
			}
			request.setAttribute("list", list);
		}
		request.getRequestDispatcher(target).forward(request, response);
	}	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("gname");
		String memo = request.getParameter("gmemo");
		boolean result = false;
		String word = "삽입";
		VisitorDAO dao = new VisitorDAO();
		VisitorVO vo = new VisitorVO();
		vo.setName(name);
		vo.setMemo(memo);
		if(id == null) {
			result = dao.c(vo);
		}else {
			vo.setId(Integer.parseInt(id));
			result = dao.u(vo);
			word = "수정";
		}
		if(result) {
			request.setAttribute("msg", name+"님의 글이 성공적으로 " + word + "되었어요!!..");
		}else {
			request.setAttribute("msg", name+"님의 글의 " + word + "에 실패했어요!!");
		}
		request.getRequestDispatcher("/jspsrc/visitorView.jsp").forward(request, response);
	}
}
