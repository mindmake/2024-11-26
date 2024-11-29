package org.mit.c504;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Chatc504")
public class Chatc504Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//해당페이지 열기
		request.getRequestDispatcher("/WEB-INF/Chatc504.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //post로 보내온 데이터 인코딩 셋팅(한글깨짐)
		//사용자 메시지 읽기
		String msg = request.getParameter("msg");
		//사용자 메시지 DB저장
		ChatDB db = new ChatDB();
		db.insert(msg);
		//응답메세지 만들기
		ChatEngine e = new ChatEngine();
		String ans = e.aaa(msg);
		//응답메세지 보내면서
		request.setAttribute("ans", ans);
		//페이지 열기
		request.getRequestDispatcher("/WEB-INF/Chatc504.jsp").forward(request, response);
		
	}

}
