<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	p90 <br>
	${dto.tno}<br>
	${dto.title}> <br>
	${dto.dueDate} <br>
	${dto.finished} <br>
	<form action="/ch01/todo/modify" method="get">
		<input type="text" value="${dto.tno}" name="tno" hidden> 
		<button type="submit">수정하기</button>
	</form>
</body>
</html>