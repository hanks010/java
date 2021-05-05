<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> jsp파일입니다 </h1>
<%
 int num = 10; // <% %> <%-- 안의 자바구문은 톰캣이 컴파일한다 // 스크립트 립 --%>
숫자는: <%=num%> 
</body>
</html>