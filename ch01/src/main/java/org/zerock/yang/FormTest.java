package org.zerock.yang;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/formtest")
public class FormTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form으로 넘어온 데이터 읽는법
		// /formtest?id=aaa&pw=1234
		String str1=request.getParameter("id");
		String str2=request.getParameter("pw");
		System.out.println(str1+" "+str2);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



}







