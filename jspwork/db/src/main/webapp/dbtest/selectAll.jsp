<%@page import="java.util.Iterator"%>
<%@page import="com.cos.domain.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.cos.domain.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	ProductDAO p = new ProductDAO();
	List <Product> products = p.상품전체보기();
	Iterator <Product> iter = products.iterator();
	while(iter.hasNext()){
		Product product = iter.next();
		out.print("상품번호: "+product.getId()+"<br>");
		out.print("상품명: "+product.getName()+"<br>");
		out.print("상품가격: "+product.getPrice()+"<br>");
		out.print("<br>");
	}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>