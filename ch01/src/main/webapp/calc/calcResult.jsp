<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>p42</h1>
num1 ${param.num1 }
num2 ${param.num2 }

<hr>

<h1>p43</h1>
${Integer.parseInt(param.num1)+Integer.parseInt(param.num2)}

<br>참고- el은 문자를 숫자로 변경해서 처리 ${param.num1 + param.num2}    

<br>참고 <%=Integer.parseInt(request.getParameter("num1"))
			+Integer.parseInt(request.getParameter("num2"))%>
</body>
</html>





