<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //톰켓이 request, response를 만들어준다
   /*   BufferedReader br = request.getReader();
 
    String input = null;
    while((input = br.readLine())!=null){
    	System.out.println(input);
    	} */ 
    
    //jsp에서는 request,response가 내장객체
    //통신에서는 데이트를 바이트스트림으로 받기 때문에 스트링이다
    String username = request.getParameter("username");
    String password = request.getParameter("password");
   	String name = request.getParameter("name");
    //getParameter 함수가 파싱을 해준다
    //username=ssar&password=1234&name=쌀 -> 이런 형식으로 데이터가 날라온다
    //request.getReader();
    //DB에 insert를 해야됨 (write)
    int result = 1;//행을 리턴, 오류 -1 리턴
    
    if(result ==1 ){
    	out.println("<script>");
    	out.println("<alert('회원가입성공')>");
    	out.println("<location.href='login.jsp'>");
    	out.println("</script>");
    	
    }
//response.sendRedirect("login.jsp");
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