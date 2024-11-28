package org.zerock.wq.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todo/modify")
public class TodoModiFy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*equest.getAttribute("tno");*/
		//1.글번호 읽기
		Long tno=Long.parseLong(request.getParameter("tno"));
		
		//2.글번호 내용조회
		TodoService service = new TodoService();
		
		//3.조회된 내용 실어서 화면 열기
		request.setAttribute("dto", service.get(tno));
		request.getRequestDispatcher("/WEB-INF/todo/modify.jsp").forward(request, response);
		
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
