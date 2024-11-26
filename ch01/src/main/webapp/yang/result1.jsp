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
	//1.보내온 값 읽고
	String strNum1=request.getParameter("num1");
	String strNum2=request.getParameter("num2");
	boolean isValue=true;
	int sum1=0,sum2=0;
	//분기
	if(strNum1!=""&&strNum2!=""){
	
		int num1=Integer.parseInt(strNum1);
		int num2=Integer.parseInt(strNum2);
			
		//2.계산하고 html에 만들값 변수로 만들어 두고
		sum1=num1+num2;
		sum2=0;
		for(int i=num1; i<=num2; i++){
			sum2+=i;
		}
	}else{
		isValue=false;
	}
%>
<%
	if(isValue){ %>
		1. <%=sum1 %> <br>
		2. <%=sum2 %>
<%	}else{ %>
		두 값을 모두 넣어 주세요.
<% 	}

%>






</body>
</html>





