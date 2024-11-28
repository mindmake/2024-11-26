<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String[] arry = {"a","b","c","d"};
	pageContext.setAttribute("list", arry);
	pageContext.setAttribute("flag", "abc");
%>

<body>
for문 <br>
<ol>
	<c:forEach var="aaa" items="${list}" varStatus="sta">
	<li>번째 ${aaa}</li>
	</c:forEach>
</ol>


<c:forEach var="aaa" items="${list}" varStatus="sta">
	${sta.count} 번째 ${aaa} <br>
</c:forEach>


<c:forEach var="aaa" items="${list}">
	${aaa } <br>
</c:forEach>

<c:forEach begin="1" end="10" step="2" var="i">
	${i}
</c:forEach>

<hr>
if문 <br>
${flag} = abc<br>
${flag=="abc"} == true <br>

<c:if test='${flag=="abc"}'>
	test 조건이 참일때 화면에 표시
</c:if>

<c:if test='${flag!="abc"}'>
	test 조건이 거짓일때 화면에 표시
</c:if>

<hr>
영역에 값세팅 <br>
스위치문 <br>
<c:set var="ddd" value="15" scope="page"></c:set>기본은 page <br>
${ddd } <br>
<c:choose>
	<c:when test="${ddd==15}">
		10일때 선택
	</c:when>
	<c:when test="${ddd==15}">
		15일때 선택
	</c:when>
	<c:otherwise>
		그외 경우		
	</c:otherwise>	
</c:choose>

<hr>

</body>
</html>