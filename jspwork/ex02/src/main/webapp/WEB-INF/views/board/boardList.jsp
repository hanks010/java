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
					<a href="/user/index" class="breadcrumb">홈</a> <a href="/user/list" class="breadcrumb">게시판 글목록</a>
				</div>
			</div>
		</nav>
		<!-- end of Breadcrumbs -->


		<div class="row">
			<h4 class="center-align">게시판 글목록</h4>
			<hr style="margin-bottom: 50px;">
		</div>

		<div class="row">
			<a href="boardWrite.html" class="waves-effect waves-light btn right"> <i class="material-icons left">create</i>새글쓰기
			</a>
		</div>

		<div class="row">
			<!-- Table -->
			<table class="highlight responsive-table ">
				<thead class="blue white-text">
					<tr>
						<th class="center-align">번호</th>
						<th class="center-align">글제목</th>
						<th class="center-align">글쓴이</th>
						<th class="center-align">작성일</th>
						<th class="center-align">조회수</th>
					</tr>
				</thead>

				<tbody>
					<tr onclick="location.href='boardContent.html'" style="cursor: pointer;">
						<td class="center-align">15</td>
						<td>eget vehicula metus. In euismod sollicitudin lorem eu .</td>
						<td class="center-align">Host Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">15000</td>
					</tr>
					<tr>
						<td class="center-align">14</td>
						<td>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</td>
						<td class="center-align">Sec Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">1500</td>
					</tr>
					<tr>
						<td class="center-align">13</td>
						<td>Vivamus viverra porttitor commodo.</td>
						<td class="center-align">Sec Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">15</td>
					</tr>
					<tr>
						<td class="center-align">12</td>
						<td>In pulvinar fermentum erat a tincidunt. Nulla id magna sit ...</td>
						<td class="center-align">Web Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">15</td>
					</tr>
					<tr>
						<td class="center-align">11</td>
						<td>Nullam ac dignissim diam. Mauris vitae magna ipsum,</td>
						<td class="center-align">Web Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">150</td>
					</tr>
					<tr>
						<td class="center-align">10</td>
						<td>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</td>
						<td class="center-align">Web Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">15000</td>
					</tr>
					<tr>
						<td class="center-align">9</td>
						<td>Vivamus viverra porttitor commodo.</td>
						<td class="center-align">Web Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">150</td>
					</tr>
					<tr>
						<td class="center-align">8</td>
						<td>In pulvinar fermentum erat a tincidunt. Nulla id magna sit ...</td>
						<td class="center-align">Sec Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">15000</td>
					</tr>
					<tr>
						<td class="center-align">7</td>
						<td>Sed diam velit, dictum a iaculis sed, tempor sed mi.</td>
						<td class="center-align">Host Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">150</td>
					</tr>
					<tr>
						<td class="center-align">6</td>
						<td>Nullam ac dignissim diam. Mauris vitae magna ipsum,</td>
						<td class="center-align">Host Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">15</td>
					</tr>
					<tr>
						<td class="center-align">5</td>
						<td>eget vehicula metus. In euismod sollicitudin lorem eu.</td>
						<td class="center-align">Host Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">15000</td>
					</tr>
					<tr>
						<td class="center-align">4</td>
						<td>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</td>
						<td class="center-align">Sec Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">1500</td>
					</tr>
					<tr>
						<td class="center-align">3</td>
						<td>Vivamus viverra porttitor commodo.</td>
						<td class="center-align">Sec Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">15</td>
					</tr>
					<tr>
						<td class="center-align">2</td>
						<td>In pulvinar fermentum erat a tincidunt. Nulla id magna sit ...</td>
						<td class="center-align">Web Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">15</td>
					</tr>
					<tr>
						<td class="center-align">1</td>
						<td>Nullam ac dignissim diam. Mauris vitae magna ipsum,</td>
						<td class="center-align">Web Admin</td>
						<td class="center-align">2021.05.11</td>
						<td class="center-align">150</td>
					</tr>
				</tbody>
			</table>
			<!-- end of Table -->
		</div>


		<div class="row center">
			<!-- Pagination -->
			<ul class="pagination">
				<li class="disabled"><a href="#!"><i class="material-icons">chevron_left</i></a></li>
				<li class="active"><a href="#!">1</a></li>
				<li class="waves-effect"><a href="#!">2</a></li>
				<li class="waves-effect"><a href="#!">3</a></li>
				<li class="waves-effect"><a href="#!">4</a></li>
				<li class="waves-effect"><a href="#!">5</a></li>
				<li class="waves-effect"><a href="#!"><i class="material-icons">chevron_right</i></a></li>
			</ul>
			<!-- end of Pagination -->
		</div>


		<div class="row">
			<form action="">
				<!-- AutoComplete -->
				<div class="col s12 l6 offset-l3">
					<div class="input-field">
						<i class="material-icons prefix">find_in_page</i> <input type="text" id="autocomplete-input" class="autocomplete"> <label for="autocomplete-input">검색</label>
					</div>
				</div>
				<!-- end of AutoComplete -->
			</form>
		</div>



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

		const ac = document.querySelector('.autocomplete');
		M.Autocomplete.init(ac, {
			data : {
				'파리' : null,
				'베네치아' : null,
				'암스테르담' : null,
				'부다페스트' : null,
				'프랑크푸르트' : null,
				'비엔나' : null,
				'드라스덴' : null,
				'프라하' : null,
				'로마' : null
			}
		});
	</script>
</body>

</html>