<%@page import="com.cos.domain.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    ProductDAO p = new ProductDAO();
    int result = p.상품한건삭제하기(1);
   	pageContext.setAttribute("result", result);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${result}</h1>
</body>
</html>
