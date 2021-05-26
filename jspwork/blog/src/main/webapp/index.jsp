<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
//response.sendRedirect("views/board/home.jsp");
response.sendRedirect("board?cmd=home"); //컨트롤러를 타고 가야함, 파일 찾는 게 아니라 콘트롤러에 필터를 거쳐야 하기 때문에 views 지워야 함
%>
