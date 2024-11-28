package org.zerock.wq.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//p69
@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//등록화면 보여주기
		request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//등록처리
		//목록화면 보여주기
		//request.getRequestDispatcher("/todo/list").forward(request, response);
		response.sendRedirect("/todo/list");
	}

}
