package org.zerock.yang;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/yang/result1.do")
public class Result1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("pz post");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		//1. 보내온 값 읽기
		String strNum1=request.getParameter("num1");
		String strNum2=request.getParameter("num2");
		
		if(strNum1!="" && strNum2!="") {
		
			//2. 계산하기
			//2-1. 숫자로 변환하기
			int num1=Integer.parseInt(strNum1);
			int num2=Integer.parseInt(strNum2);
			//2-2. 계산하기 (더하고, 모두 더하고)
			int sum1=num1+num2;
			int sum2=0;
			for(int i=num1; i<=num2; i++) {
				sum2+=i;  //sum = sum +i
			}
					
			//3. 보여주고 싶은 화면만들기(응답)
			response.getWriter().append("<html> 1. "+sum1 +"<br>" + "2. "+sum2 +"</html>");
		}else {
			response.getWriter().append("값 둘다 넣어주세요");
		}
	}

}




