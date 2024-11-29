<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${readview}"> <!-- 의미 없음 -->
	글 번호 <input type="text" value="${readview.tno}"> <br>
	할일 <input type="text" value="${readview.title}"> <br>
	날짜 <input type="text" value="${readview.dueDate}">  <br>
	완료여부  <input type="text" value="${readview.finished}"> <br>
	<button type="submit" >수정하기</button>	 <button type="submit" >삭제하기</button>	
	</c:forEach> <!-- 의미 없음 -->
	
	<hr>
	글 번호 ${dto.tno} <br> 
	할일 <input type="text" value="${dto.title}"> <br>
	날짜 <input type="text" value="${dto.dueDate}"> <br>
	완료여부 <input type="text" value="${dto.finished}"> <br>
	<button >수정하기</button>
	<button >삭제하기</button>
</body>
</html>