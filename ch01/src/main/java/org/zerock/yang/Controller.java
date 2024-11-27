package org.zerock.yang;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/yang/model2/*")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public Controller() {
        super();
        
        
    }

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get 요청과 post 요청을 함께 처리
		//1.요청url 확인
		String uri = request.getRequestURI();
		System.out.println("요청uri:"+uri);
		//2.마지막 / 이후 문자만 뽑기
		int lastSlash = uri.lastIndexOf("/");
		System.out.println("마지막/몇번째:"+lastSlash);
		String command = uri.substring(lastSlash+1);
		System.out.println("요청url:"+command);
		//3.요청에 따라서 처리하기
		if(command.equals("model2")) {
			//로그인화면 보여주고
			//1.리다이렉트 방법(url변경) -서버주소 부터 시작됨
			//response.sendRedirect("/ch01/yang/model2result"); //리다이렉트
			
			//2.디스패쳐(url유지) - 컨테스트 매뉴(배포디렉토리)부터 시작됨
			RequestDispatcher dis = request.getRequestDispatcher("/yang/model2.jsp");
			dis.forward(request, response);
			
		} else if(command.equals("model2result")) {
			//로그인 처리하고
			
			UserService service = new UserService();
			UserVO vo = new UserVO();
			vo.setId(request.getParameter("id"));
			vo.setPw(request.getParameter("pw"));
			vo.setEmail(request.getParameter("email"));
			boolean isOK = service.insertUser(vo);
			
			//로그인 처리화면 보여주고
			if(isOK) {
				request.setAttribute("id", vo.getId());
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("/yang/model2result.jsp");
			dis.forward(request, response);
			
			
		} else {
			//에러페이지 보여주고
			
			//userVO 객체에 값을 넣어서 aaa 이름으로 데이터를 보내면서 result.jsp 페이지 열기
			UserVO vo = new UserVO();
			vo.setId("이것은");
			vo.setPw("페이지를 열때");
			vo.setEmail("값을 실어서 보내는 방법");
			
			request.setAttribute("aaa", vo);
			//RequestDispatcher dis = request.getRequestDispatcher("/result.jsp");
			//dis.forward(request, response);
			//response.sendRedirect("/ch01/result.jsp"); //리다이렉트
			
			
		}
		
		//요청이 오면 서블릿에서 처리할수있는 두가지 방법이 있다.
		//1. 리다이렉트(redirect) : 새로운 요청(url이 변경) 즉, 새로운 request
		//2. 디스패쳐(dispatcher) : url이 유지하면서 요청처리 즉, request가 유지
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
