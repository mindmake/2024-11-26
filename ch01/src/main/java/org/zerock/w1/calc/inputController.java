package org.zerock.w1.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc/input")
public class inputController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("인풋컨트롤러...... 겟 요청");
		//WEB-INF/clac/input.jsp 보여주기
		request.getRequestDispatcher("/WEB-INF/calc/input.jsp").forward(request, response);
	}

}
