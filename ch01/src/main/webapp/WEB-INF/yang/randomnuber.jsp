<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>숫자 맞추기 게임에 온것을 환영합니다.</h1>
	1~100 사이 숫자를 10번 안에 맞춰라! <br>
	시도 횟수${usertry}
	<form action="/ch01/Game">
		<input type="number" name="user" placeholder="숫자를 입력해라!(시도횟수:"${usertry}")"> <br><br>
		<button type="submit">입력</button> <br><br>
		${num}
		
	</form>
</body>
</html>