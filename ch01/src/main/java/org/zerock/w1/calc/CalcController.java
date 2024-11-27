package org.zerock.w1.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//p50
@WebServlet("/calc/makeResult")
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//post 요청
	//1.보내온 값을 읽고 잘 읽었는지 확인
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		System.out.printf(" num1: %s", num1);
		System.out.printf(" num2: %s", num2);
		//처리
		
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		
		request.getRequestDispatcher("/WEB-INF/calc/calcResult.jsp").forward(request, response);
		
		//p52 리다이렉트
		//response.sendRedirect("/index.html");
		
		//p53 PRG 패턴 예>
		//게시판에 글을 쓰고 글등록 버튼을 누루면 post 보내고
		//db 저장 하고 목록보기 화면을 보여준다.(redirect)

	}

}
