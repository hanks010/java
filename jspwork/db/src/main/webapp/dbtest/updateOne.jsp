<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateProc.jsp" method = "post"> <!--원래는 update 할 때 put -->
	<input type="text" name="id" placeholder="상품번호" />
	<input type="text" name="name" placeholder="상품명" />
	<input type="text" name="price" placeholder="상품가격" />
	<button type="submit">상품 수정</button>
</form>
</body>
</html>