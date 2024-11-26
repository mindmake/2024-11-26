package org.zerock.yang;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlettest")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		//1부터 10까지 홀수만 누적되는 결과보기 출력하기
		response.getWriter().append("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>");
		
		int num=3;
	
		response.getWriter().append(num+"<br>");
		response.getWriter().append(Math.random()+" ");
		/* jsp에서 1.자바코드는 <%  %>  2.값을 html표시하기 위해서는 <%= %>  
	       주석은 나다 */
		response.getWriter().append("<!-- 난 html 주석 " + num +" -->");
		response.getWriter().append("1부터 10까지 홀수만 누적되는 결과보기 출력하기<br>");
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1)
				sum+=i;
			System.out.println(sum);
			response.getWriter().append(sum+" ");
		}
	}

}






