<%@page import="com.cos.domain.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
//int id = Integer.parseInt(request.getParameter("id"));
String name = request.getParameter("name");
int price = Integer.parseInt(request.getParameter("price"));

ProductDAO p = new ProductDAO();
//p.상품추가(2,"사과",1000);
int result = p.상품추가(name, price);
%>

<html>
<body>
	<h1>
		<%
		if (result == 1) {
			out.println("product insert success"+"<br>");
		} else{
			out.print("product insert failure");
		}
		%>


	</h1>

</body>

</html>