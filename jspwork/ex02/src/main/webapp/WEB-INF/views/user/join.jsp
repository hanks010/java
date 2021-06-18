<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>

<body>
	<!-- App -->
	<div id="app">

		<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>

		<!-- Breadcrumbs -->
		<nav>
			<div class="nav-wrapper cyan">
				<div class="col s12">
					<a href="/user/index" class="breadcrumb">홈</a> <a href="/user/join" class="breadcrumb">회원가입</a>
				</div>
			</div>
		</nav>
		<!-- end of Breadcrumbs -->


		<!-- Forms -->
		<div class="row">
			<h4 class="center-align">회원가입</h4>
			<hr style="margin-bottom: 50px;">

			<form class="col s12 l6 offset-l3" action="#!">
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">assignment_ind</i> <input type="text" id="member_id" class="validate" data-length="13" name ="id"> <label for="member_id">아이디</label> <span class="helper-text">*아이디는
							필수 입력 항목입니다.</span>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<i class="material-icons prefix">lock</i> <input type="password" id="password" class="validate" data-length="20" name="passwd"> <label for="password">비밀번호</label>
					</div>
				</div>
				

				<div class="row center-align">
					<button type="submit" class="btn-large waves-effect waves-light">
						계정 생성하기 <i class="material-icons right">send</i>
					</button>
				</div>

				<div class="row">
					<blockquote>
						회원으로 가입하시면 <a>서비스 약관</a>에 동의하게 됩니다.
					</blockquote>
				</div>
			</form>
		</div>
		<!-- end of Forms -->

	</div>
	<!-- end of Container -->


	<!-- Footer -->
	<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
	<!-- end of Footer -->

	</div>
	<!-- end of App -->



	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	<script>
		const sideNav = document.querySelector('.sidenav');
		M.Sidenav.init(sideNav, {});

		var textNeedCount = document.querySelectorAll('#member_id, #password');
		M.CharacterCounter.init(textNeedCount);
	</script>
</body>

</html>