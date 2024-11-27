<%@page import="org.zerock.yang.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
나야 result.jsp
<%
	UserVO vo = (UserVO)request.getAttribute("aaa");
	String id=vo.getId();
	String pw=vo.getPw();
	String email=vo.getEmail();
%>

<%=id %><br> <%=pw %><br> <%=email %>
<hr>
<%=((UserVO)request.getAttribute("aaa")).getId() %>
<%=((UserVO)request.getAttribute("aaa")).getPw() %>
<%=((UserVO)request.getAttribute("aaa")).getEmail() %>
<hr>
${aaa.id} <br>
${aaa.pw} <br>
${aaa.email}
</body>
</html>