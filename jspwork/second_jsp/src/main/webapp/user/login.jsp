<%@page import="com.cos.util.Cal"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int result = Cal.add(1,2);
	String contextPath = request.getContextPath();
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr/>
<!-- Post방식으로 username, password를 form으로 home.jsp 전송하고 home.jsp에서 두 값을 출력하라 -->
<h3><%=contextPath %></h3>
<h1>로그인 화면 <%=result%></h1>

<form action ="<%=contextPath%>/home.jsp" method ="post">
	<input type="text" name = "username" placeholder="username"/>
	<input type="text" name = "password" placeholder="password"/>
	<button type = "submit">로그인</button>
	<!-- <input type="submit" value ="로그인"> -->
</form>
<br>
<a href = "join.jsp">회원가입이 아직 되지 않았나요?</a>
</body>
</html>