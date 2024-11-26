<%@page import="org.zerock.yang.UserVO"%>
<%@page import="org.zerock.yang.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//1.보내온 값읽기
	//2.이용해서 처리
		//2-1.id가 중복이면 중복 페이지 출력 
		//2-2.신규일 때만 
			//2-2-1.회원가입후
			//2-2-2.가입 완료 페이지 출력

String id=request.getParameter("id");
String pw=request.getParameter("pw");
String email=request.getParameter("e-mail");

UserDAO dao = new UserDAO();
if(dao.isID(id)){  %>
	<h1>중복된 아이디 입니다. 회원가입을 다시 진행해 주세요</h1>
<% }else{
	UserVO vo = new UserVO();
	vo.setId(id); vo.setPw(pw); vo.setEmail(email);
	dao.insertUser(vo); %>
	<h1><%=id%>님 회원 가입을 축하드립니다.</h>
<% } %>
</body>
</html>

