<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="william" />
	<c:choose>
		<c:when test="${name ne 'william'}">
			is not william 
		</c:when>
		<c:otherwise>
		is william
		</c:otherwise>
	</c:choose>


	<c:if test="${10*10 eq 100}">
			10 곱하기 10은 100
		</c:if>


</body>
</html>