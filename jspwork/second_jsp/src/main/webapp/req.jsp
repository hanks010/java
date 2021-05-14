<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
   	String contextPath = request.getContextPath();
    String contentType = request.getContentType();
    String remoteAddr = request.getRemoteAddr();
    String protocol = request.getProtocol();
   	String method = request.getMethod();
   	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 연습하기</title>
</head>
<body>
<h1>request 연습하기</h1>
<hr/>
ContextPath: <%=contextPath%> <br/>
ContextType: <%=contentType%> <br/>
remoteAddr: <%=remoteAddr%> <br/>
<%=protocol%>
</body>
</html>