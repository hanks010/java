<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 리다이렉션과 포워드의 차이</h1>
<hr/>
<%
request.setAttribute("money", 10000);
RequestDispatcher dis = request.getRequestDispatcher("c.jsp");
dis.forward(request, response);
	//String data = (String)request.getAttribute("data"); //어떤 타입을 받을 지 톰캣이 알 수 없기 때문에 Object 형식으로 받는다 
%>

</body>
</html>