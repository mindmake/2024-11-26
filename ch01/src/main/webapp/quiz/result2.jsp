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
	String lunch=request.getParameter("lunch");
	if(lunch!=null){
		if(lunch.equals("")){ %>
			굶지 마세요.
<%		}else{   %>
			<%=lunch%> 맛있게 드세요
<% 		}
	}else{ %>
		해킹금지
<% 	}
		
%>
</body>
</html>



