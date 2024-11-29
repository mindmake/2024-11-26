<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${read}" var="readview"> <!-- 의미 없음 -->
		${read.tno} <br>
		${read.title} <br>
		${read.dueDate} <br>
		${read.finished} <br>
	</c:forEach> <!-- 의미 없음 -->
		
	
	<hr>
	p90 <br>
	${dto.tno}<br>
	${dto.title}> <br>
	${dto.dueDate} <br>
	${dto.finished} <br>
	<form action="/ch01/todo/modify" method="get">
		<input type="text" value="${dto.tno}" name="tno" hidden>
		<input type="text" value="${dto.tno}" name="readview" hidden> 
		<button type="submit">수정하기</button>
	</form>
</body>
</html>