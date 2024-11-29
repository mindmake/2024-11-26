<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인공지능 챗봇</title>
</head>
<body>
	챗봇대답 :<br>
	<textarea rows="5" cols="50">${ans}</textarea>
	<form action="Chatc504" method="Post">
		사용자: <br>
		<input type="text" name="msg" style="width: 427px;" placeholder="입력하세요"> <br>
		<input type="submit" value="전송">	
	</form>
	
</body>
</html>