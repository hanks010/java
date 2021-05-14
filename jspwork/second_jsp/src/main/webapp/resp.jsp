<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//request의 생명주기는 요청하고 응답 한 번이면 끝난다, 다른 페이지로 갈 때마다 사라진다
    	request.setAttribute("data", "데이터");
    	//response.sendRedirect("test.jsp");
    	
    	 //RequestDispatcher를 쓰면 일시적으로 데이터를 들고 갈 수 있다, request와 response 객체를 그대로 유지한다, 데이터도 유지됨
    	 RequestDispatcher dis = request.getRequestDispatcher("test.jsp");
    	dis.forward(request, response); 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response 연습하기</title>
</head>
<body>
<h1>response 연습하기</h1 >
<hr/>
</body>
</html>