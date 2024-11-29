package org.zerock.wq.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//p67->81
@WebServlet("/todo/list")
public class TodoListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("할일 목록 요청");
		TodoService service = new TodoService();
		List<TodoDTO> dolist = service.getList(); //화면목록을 dolist이름으로 보내라
		System.out.println("TodoList"+dolist);
		
		request.setAttribute("list",dolist);
		
		request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}
}
