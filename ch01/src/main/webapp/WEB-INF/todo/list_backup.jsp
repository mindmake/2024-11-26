<%@page import="org.zerock.wq.todo.TodoDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 목록</title>
</head>
<body>
	<h1>할일목록</h1> <button type="button" onclick="location.href='/ch01/todo/register'">할일 쓰기</button>
	<br>
	<%
		List<TodoDTO> list =(List)request.getAttribute("list");
		for(TodoDTO dto : list) { %>
			<%=dto.getTno()%>. <%=dto.getDueDate() %>
			
<%		if(dto.isFinished()){ %>
				 완료
<% 		}else{ %>
				미 완료
<%		} %>
			<br>
<%		}
%>

<hr>
${list}
<hr>
<c:forEach items="${list}" var="dto">
${dto.tno}. ${dto.title}. ${dto.getDueDate()}. ${dto.finished ? "완료" : "미완료"} <br>
</c:forEach>
</body>
</html>