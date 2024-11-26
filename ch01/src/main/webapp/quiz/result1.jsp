<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	if(id!=null){
		if(request.getParameter("pw").equals("1234")){ %>
			<%=id %>님 환영합니다.
<%		}else{                                         %>
			<%=id %>님 사라져주세요.
<% 		}   
	}else{ 											   %>
		바르게 접근해주세요(<a href="quiz1.jsp">로그인 화면 가기</a>)
<% 	}												   %>
</body> 
</html>

