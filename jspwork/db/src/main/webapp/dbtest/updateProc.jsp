<%@page import="com.cos.domain.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");	
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    int price = Integer.parseInt(request.getParameter("price"));
    
    System.out.println(id);
    System.out.println(name);
    System.out.println(price);
    
	ProductDAO p = new ProductDAO();
    //DB 연결해서 UPDATE 하고 Result값 받아서 출력하기
    int result = p.상품한건수정하기(id, name, price);
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