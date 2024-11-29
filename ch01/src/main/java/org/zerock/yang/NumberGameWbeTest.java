package org.zerock.yang;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Game")
public class NumberGameWbeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		String userstr =  request.getParameter("user");
		int usertry = 0; // 시도 횟수	
		
		if(userstr==null){
			session.setAttribute("usertry", "0");
			request.getRequestDispatcher("/WEB-INF/yang/randomnuber.jsp").forward(request, response);
						
		} else {
			int user =Integer.parseInt(userstr) ; //웹페이지에서 값을 받아옴
			System.out.println("사용자"+user);
			

			
	
			if(usertry<=10) {
				int random=0;
				if(usertry==0) {
					random =  (int) ((Math.random() * 100) +1); //1~100까지 숫자 램덤
				}
				
				System.out.println("컴퓨터"+random);
				if (user!= random) {
					usertry ++; //시도 횟수 증가
					
					if(user > random ) {
						if(usertry>0) {
							session.setAttribute("num", "입력한 숫자가 더 커!");
						}
						session.setAttribute("usertry", usertry);
						request.getRequestDispatcher("/WEB-INF/yang/randomnuber.jsp").forward(request, response);
						
						
					} else if(user < random) {
						if(usertry>0) {
							session.setAttribute("num", "입력한 숫자가 더 작아!");
						}
						session.setAttribute("usertry", usertry);
						request.getRequestDispatcher("/WEB-INF/yang/randomnuber.jsp").forward(request, response);

						
					} else {
						session.setAttribute("num", "정답이다!");
						session.setAttribute("usertry", usertry);
						request.getRequestDispatcher("/WEB-INF/yang/randomnuber.jsp").forward(request, response);


						
					}
				}
	
				
			}else { //if
				session.setAttribute("num", "틀렸어! 넌 안되겠다!");
				session.setAttribute("usertry", usertry);
				request.getRequestDispatcher("/WEB-INF/yang/randomnuber").forward(request, response);

			}
		}
		
		
		//session.setAttribute("num", Math.random());
		
		//request.getRequestDispatcher("/ch01/WEB-INT/yang/randomnuber").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
