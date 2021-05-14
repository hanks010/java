<%@page import="com.cos.domain.Product"%>
<%@page import="com.cos.domain.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");
	ProductDAO d = new ProductDAO();
	Product p = d.상품한건보기(1);
	out.print("상품번호: "+p.getId()+"<br>");
	out.print("상품명: "+p.getName()+"<br>");
	out.print("상품가격: "+p.getPrice()+"<br>");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>