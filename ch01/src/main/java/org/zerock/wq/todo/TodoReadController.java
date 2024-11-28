package org.zerock.wq.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//p89
@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//       /todo/read?tno=1
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.보내온 글번호 읽기(문자->Long)
		 Long tno = Long.parseLong(request.getParameter("tno"));
		 
		//2.글번호로 글 조회하기
		 TodoService service = new TodoService();
		 TodoDTO dto = service.get(tno);
		 
		//3.조회된 내용을 보내면서 해당페이지 열기
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request, response);
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
