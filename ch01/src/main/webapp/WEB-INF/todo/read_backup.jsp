<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/todo/modify" method="get">
		p90 <br>
		${dto.tno} <br>
		${dto.title} <br>
		${dto.dueDate} <br>
		${dto.finished} <br>
		<button>수정하기</button>	
	</form>
</body>
</html>