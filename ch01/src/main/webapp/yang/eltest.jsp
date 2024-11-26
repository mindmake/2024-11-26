
<%@page import="org.zerock.yang.StudentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
p82
jsp의 java를 표현식을 좀더 자연스럽게 표현하기 위한 라이브러리(expression language) el-api.jar
<b><%=request.getParameter("num1")%></b>
<br>
<b>${param.num1}</b>  <br>  form으로 보내온 num1 값 읽기 (null 일때는 무시)
<hr>
테스트 ${request.getParameter("num1") }
-> 영역객체들중에 request 이름의 데이터 있는지 확인하고
있다면 request데이터의 getParameter("num1")를 실행하고 리턴값을 찍어라 -> 즉, 없으니까 null<br>

${Integer.parseInt("123")} 이건 인티저 클래스의 paresInt 메소드를 호출하게됨.
<hr>

<%
	StudentVO vo = new StudentVO();
	vo.setName("홍길동");
	vo.setAge(22);
	
	//request 영역에 data 추가 (이름, 값)
	request.setAttribute("s1", vo);
	
	int num=15;
	pageContext.setAttribute("num", num); //page 객체에 데이터 추가
%>

<%=((StudentVO)request.getAttribute("s1")).getName() %>
<%=((StudentVO)request.getAttribute("s1")).getAge() %>

동일코드를 el로 작성하면
${s1.name}
${s1.age}

<hr>
주의 > el이 값을 읽어올때
page -> request -> session -> application 영역을 순차적으로 확인해서
있는값을 출력한다. (자바의 변수값 직접 접근 불가) <br>
${num} null이 null이라고 출력안함




</body>
</html>







