package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.MemberVO;

@WebServlet("/memberinfo")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		MemberVO vo = new MemberVO();
		ArrayList<String> info = new ArrayList<>(Arrays.asList("myname","mynumber","myacc","mypasswd"));
		String str = "";
		
		for(int i = 0; i<info.size(); i++) {
			str = request.getParameter(info.get(i));
			if(str == null || str.equals(""))
				info.set(i, "없음");
			else
				info.set(i, str);
		}
		vo.setName(info.get(0));		
		vo.setNumber(info.get(1));
		vo.setAccount(info.get(2));
		vo.setPasswd(info.get(3));
		
		request.setAttribute("memberinfo2", vo); 
		request.getRequestDispatcher("/jspsrc/memberViewEL.jsp").forward(request, response);
	}

}
