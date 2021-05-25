<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form action="${cp}/user?cmd=login" method="post">
		<!--select는 get,패스워드를 주소값에 노출할 수 없기 때문에 예외적으로 post -->
		<div class="form-group">
			<input type="text" class="form-control" placeholder="Enter username" value ="<%-- ${cookie.메소드} --%>" name="username" required="required" />
		</div>
		<div class="form-group">
			<input type="password" class="form-control" placeholder="Enter password" name="password" required="required" />
		</div>

		<div class="form-group form-check">
			<label class="form-check-label"> <input class="form-check-input" type="checkbox" name="rememberMe"> Remember me
			</label>
		</div>

		<button type="submit" class="btn btn-primary">로그인</button>
	</form>
</div>


<%@ include file="../layout/footer.jsp"%>
