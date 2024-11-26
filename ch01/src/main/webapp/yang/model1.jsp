<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h1>Model1 방식의 회원가입 페이지</h1>
<form action="model1result.jsp" method="post">
	아이디:<input type="text" name="id" required> <br>
	패스워드:<input type="password" name="pw" required> <br>
	이메일:<input type="email" name="email" required> <br>
	<input type="submit" value="회원가입"> <input type="reset" value="초기화">
</form>
</body>
</html>