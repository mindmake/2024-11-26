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
	if(request.getAttribute("id")!=null){ %>
		<h1>${id}님 회원 가입을 축하드립니다.</h>
<%	}else{ %>
		<h1>중복된 아이디 입니다. 회원가입을 다시 진행해 주세요</h1>
<%	}
%>
<hr>
el이 변수를 무조건 숫자로변환해서 처리하기에 문자 더하기를 쓸수 없어서 <br>
${id}
${ id!=null ? "님 회원 가입을 축하드립니다." : "중복된 아이디 입니다. 회원가입을 다시 진행해 주세요" }

</body>
</html>

