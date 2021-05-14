<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 화면</h1>
<hr/>
<form action = "joinProc.jsp" method = "post"> <!--put, post데이터가 버퍼를 타고 들어옴, 바디영역에 데이터 담고 옴,헤더영역이 데이터를 설명함
//delete, get -바디데이터가 필요없다,주소값(쿼리스트링)에 데이터를 싣고 옴 --> 
	<input type="text" placeholder="username" name ="username"/>
	<input type="text" placeholder="password" name = "password"/>
	<input type="text" placeholder="name" name = "name"/>
	<button type ="submit">전송</button> <!--submit일 경우 form태그 안의 내용을 전송 -->
</form> <!--form 태그 안의 내용이 묶여서 전송 -->
<br> <!-- http://localhost:8000/second_jsp/user/joinProc.jsp?username=ssar&password=1234&name=%EC%8C%80 
?뒤 쿼리스트링, 형식 - key=value -->
<a href = "login.jsp">이미 회원가입이 되어 있나요?</a>
</body>
</html>