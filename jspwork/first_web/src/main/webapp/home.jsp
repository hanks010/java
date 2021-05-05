<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> jsp파일입니다 </h1>
<%!
 int num = 10;
 int data = 50;
 public int myMethod(int count){
		return ++count;
	}
 int sum(int a, int b){
	 return a + b;
 }
 %> <%-- 내부의 자바구문은 톰캣이 컴파일한다 // 스크립틀립 --%>
 <% int i = 1; 
 out.println(i+"<br>");
 /*!없으면 지역변수 */
 %>
숫자는: <%=num%> <!--표현문 -->
<br>
<% 
out.print("전역 메소드 myMethod의 결과값은 "+myMethod(0)+"<br>");
out.print("2+3은 "+sum(2,3));
%>
<p>Today's date: <%= new java.util.Date()%></p>
<!-- html 주석 --> 
<%--html 주석은 서블릿으로 변환될 때 주석이 무시되지 않기 때문에 표현문 태그와 스크립틀릿 태그가 있다면 모두 컴파일된다--%>
<%-- jsp 주석 --%>
</body>
</html>