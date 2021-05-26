<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%-- <%jsp:include page = "../layout/header.jsp"> </jsp:include> 컴파일한 뒤 html 파일을 가져옴, 잘 안 씀, 표현식 컴파일 불가--%>
<%@ include file="../layout/header.jsp"%>
<!-- 가져와서 컴파일 함 -->

<div class="container">
	<!-- 화면의 70%를 차지하고 가운데에 위치-->
	<!-- var는 pageScope에 저장 -->
	<c:forEach var="board" items = "${boards}">
		<!-- 게시글 아이템 시작 -->
		<div class="card gap_b_20">
			<div class="card-body">
				<h4 class="card-title">${board.title}</h4>
				<a href="${cp}/boards?cmd=detail&id=${board.id}" class="btn btn-primary">상세보기</a>
				<!-- ${cp}/views/boards?cmd=detail.jsp 로 보내면 파일만 받아오고 값을 못 받음-->
			</div>
		</div>
		<!-- 게시글 아이템 종료 -->
	</c:forEach>

</div>

<%@ include file="../layout/footer.jsp"%>



