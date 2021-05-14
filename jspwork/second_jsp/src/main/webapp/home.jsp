<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    out.println("id = "+username);
    out.print("password = "+password+"<br>");
    
    Enumeration en = request.getHeaderNames();
    while(en.hasMoreElements()){
    	String headerName = (String)en.nextElement();
    	String headerValue = request.getHeader(headerName);
    }
    
    String Qs = request.getQueryString();
    int port = request.getServerPort();
    String uri = request.getRequestURI();
    String protocol = request.getProtocol();
    String server_name = request.getServerName();
    String contentType = request.getContentType();
    
    out.print(port+"<br>");
    out.print(Qs+"<br>");
    out.print(uri+"<br>");
    out.print(protocol+"<br>");
    out.print(server_name+"<br>");
    out.print(contentType);
 int result = 1;//행을 리턴, 오류 -1 리턴
    
   /*  if(result ==1 ){
    	out.println("<script>");
    	out.println("<alert('로그인 성공')>");
    	out.println("</script>");
    	
    } */
    %>
    home.jsp
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>