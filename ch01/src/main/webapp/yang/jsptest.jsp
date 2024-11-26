<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int num=3;
%>

<%=num %> <br>

<%=Math.random() %>
<%--   jsp에서 1.자바코드는 <%  %>  2.값을 html표시하기 위해서는 <%= %>  
       주석은 나다 --%>
<!-- 난 html 주석 <%=num %> -->


1부터 10까지 홀수만 누적되는 결과보기 출력하기<br>
<%
	int sum=0;
	for(int i=1; i<=10; i++){ 
		if(i%2==1)
			sum+=i;
		System.out.println(sum); //콘솔에 찍기, 즉 톰켓 로그 %>
		<%=sum%> <!-- html에 찍기 -->
<%	}
%>


</body>
</html>








