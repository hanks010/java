<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 폼태그 생성 id, name, price POST 방식으로 insert.jsp에 요청하기 -->
<!-- insert.jsp에서 테이블에 insert -->
<form action ="insert.jsp" method ="POST">
<input type="text" placeholder="name" name = "name">
<input type="text" placeholder = "price" name = "price">
<button type ="submit">제출</button>
<button type ="reset">취소</button>  
</form>
</body>
</html>