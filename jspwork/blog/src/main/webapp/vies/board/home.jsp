<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%-- <%jsp:include page = "../layout/header.jsp"> </jsp:include> 컴파일한 뒤 html 파일을 가져옴, 잘 안 씀, 표현식 컴파일 불가--%>
<%@ include file="../layout/header.jsp"%>
<!-- 가져와서 컴파일 함 -->

<div class="container">
	<!-- 화면의 70%를 차지하고 가운데에 위치-->

	<c:forEach begin="1" end="4">
		<!-- 게시글 아이템 시작 -->
		<div class="card gap_b_20">
			<div class="card-body">
				<h4 class="card-title">제목입니다!</h4>
				<a href="#" class="btn btn-primary">상세보기</a>
			</div>
		</div>
		<!-- 게시글 아이템 종료 -->
	</c:forEach>

</div>

<%@ include file="../layout/footer.jsp"%>



