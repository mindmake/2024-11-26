<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	<c:forEach items="${read}">
	글 번호 <input type="text" value="${param.tno}"> <br>
	할일 <input type="text" value="${param.title}"> <br>
	날짜 <input type="text" value="${param.dueDate}">  <br>
	완료여부  <input type="text" value="${param.finished}"> <br>
	<button type="submit" >수정하기</button>	 <button type="submit" >삭제하기</button>	
	</c:forEach>	 --%>
	글 번호 ${dto.tno} <br> 
	할일 <input type="text" value="${dto.title}"> <br>
	날짜 <input type="text" value="${dto.dueDate}"> <br>
	완료여부 <input type="text" value="${dto.finished}"> <br>
	<button >수정하기</button>
	<button >삭제하기</button>
</body>
</html>