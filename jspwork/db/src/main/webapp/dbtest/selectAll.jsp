<%@page import="java.util.Iterator"%>
<%@page import="com.cos.domain.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.cos.domain.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("utf-8");
	ProductDAO p = new ProductDAO();
	List <Product> products = p.상품전체보기();
	//pageContext.setAttribute(arg0, arg1);
	request.setAttribute("products", products);
	//session.setAttribute(arg0, arg1);
	//application.setAttribute(arg0, arg1);
	Iterator <Product> iter = products.iterator();
/* 	while(iter.hasNext()){
		Product product = iter.next();
		out.print("-----------------------"+"<br>");
		out.print("상품번호: "+product.getId()+"<br>");
		out.print("상품명: "+product.getName()+"<br>");
		out.print("상품가격: "+product.getPrice());
		out.print("<br>");
	} */
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>JSTL 문법</h2>
<c:forEach var="product" items="${requestScope.products}">
상품번호:${product.id} <br/>

</c:forEach>


<h2>JSTL 문법</h2>
<% 
for(Product product:products){
%>
----------------------------------------------<br/>
	상품번호: <%=product.getId()%> <br/> 상품이름: <%=product.getName()%> <br/> 상품가격:<%=product.getPrice()%><br/>
<%
}
%>
</body>
</html>