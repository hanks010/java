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
	</div>

	<div class="container">
		<!-- Image Slider -->
		<div class="slider">
			<ul class="slides">
				<li><img src="/resources/imgs/amsterdam.jpg">
					<div class="caption center-align">
						<h2>풍차의 나라</h2>
						<h5 class="light grey-text text-lighten-3 hide-on-small-only">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Officiis accusantium libero, natus quibusdam nesciunt exercitationem
							commodi quo dolore asperiores tenetur. Perspiciatis cupiditate molestias eligendi placeat ab asperiores ex quae enim!</h5>
					</div></li>
				<li><img src="/resources/imgs/dresden.jpg">
					<div class="caption left-align">
						<h2>다시가고 싶은 도시</h2>
						<h5 class="light grey-text text-lighten-3 hide-on-small-only">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Officiis accusantium libero, natus quibusdam nesciunt exercitationem
							commodi quo dolore asperiores tenetur. Perspiciatis cupiditate molestias eligendi placeat ab asperiores ex quae enim!</h5>
					</div></li>
				<li><img src="/resources/imgs/venezia.jpg">
					<div class="caption right-align">
						<h2>세계적인 수상도시</h2>
						<h5 class="light grey-text text-lighten-3 hide-on-small-only">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Officiis accusantium libero, natus quibusdam nesciunt exercitationem
							commodi quo dolore asperiores tenetur. Perspiciatis cupiditate molestias eligendi placeat ab asperiores ex quae enim!</h5>
					</div></li>
			</ul>
		</div>
		<!-- end of Image Slider -->

		<!-- AutoComplete -->
		<div id="search" class="cyan white-text center">
			<div class="row">
				<div class="col s12">
					<h5>검색</h5>
					<div class="input-field">
						<i class="material-icons prefix">location_on</i> <input type="text" class="white grey-text autocomplete" id="autocomplete-input" placeholder="드라스덴, 파리, 프라하, ...">
					</div>
				</div>
			</div>
		</div>
		<!-- end of AutoComplete -->
	</div>


	<div class="container">
		<!-- Collapsible -->
		<ul class="collapsible">
			<li>
				<div class="collapsible-header">
					<i class="material-icons">filter_drama</i>First
				</div>
				<div class="collapsible-body">
					<span>Lorem ipsum dolor sit amet.</span>
				</div>
			</li>
			<li>
				<div class="collapsible-header">
					<i class="material-icons">place</i>Second
				</div>
				<div class="collapsible-body">
					<span>Lorem ipsum dolor sit amet.</span>
				</div>
			</li>
			<li>
				<div class="collapsible-header">
					<i class="material-icons">whatshot</i>Third
				</div>
				<div class="collapsible-body">
					<span>Lorem ipsum dolor sit amet.</span>
				</div>
			</li>
		</ul>
		<!-- end of Collapsible -->

	</div>
	<!-- end of Container -->





	<!-- Container -->
	<div class="container">

		<!-- Basic Card -->
		<div class="row">
			<div class="col s12 m4">
				<div class="card blue darken-1">
					<div class="card-content white-text">
						<span class="card-title">카드 제목1</span>
						<p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Numquam, distinctio. Quasi debitis dolores nobis laudantium. Ullam totam, exercitationem quae consequatur possimus rem sit vitae
							inventore commodi, omnis, officia tempora rerum!</p>
					</div>
					<div class="card-action">
						<a href="#">링크입니다.</a>
					</div>
				</div>
			</div>
			<div class="col s12 m4">
				<div class="card teal darken-1">
					<div class="card-content white-text">
						<span class="card-title">카드 제목2</span>
						<p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Numquam, distinctio. Quasi debitis dolores nobis laudantium. Ullam totam, exercitationem quae consequatur possimus rem sit vitae
							inventore commodi, omnis, officia tempora rerum!</p>
					</div>
					<div class="card-action">
						<a href="#">링크입니다.</a>
					</div>
				</div>
			</div>
			<div class="col s12 m4">
				<div class="card pink lighten-2">
					<div class="card-content white-text">
						<span class="card-title">카드 제목3</span>
						<p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Numquam, distinctio. Quasi debitis dolores nobis laudantium. Ullam totam, exercitationem quae consequatur possimus rem sit vitae
							inventore commodi, omnis, officia tempora rerum!</p>
					</div>
					<div class="card-action">
						<a href="#">링크입니다.</a>
					</div>
				</div>
			</div>
		</div>
		<!-- end of Basic Card -->

		<!-- Image Card -->
		<div class="row">
			<div class="col s12 m6">
				<div class="card">
					<div class="card-image">
						<img src="/resources/imgs/praha.jpg"> <span class="card-title">프라하</span>
					</div>
					<div class="card-content">
						<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Assumenda officiis eos saepe, itaque at consectetur voluptatibus illum dolores! Sit, unde harum recusandae incidunt optio illum
							quaerat sapiente dolore nihil dolorem?</p>
					</div>
					<div class="card-action">
						<a href="#">링크1</a>
					</div>
				</div>
			</div>
			<div class="col s12 m6">
				<div class="card">
					<div class="card-image">
						<img src="/resources/imgs/vienna.jpg"> <span class="card-title">비엔나</span>
					</div>
					<div class="card-content">
						<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Assumenda officiis eos saepe, itaque at consectetur voluptatibus illum dolores! Sit, unde harum recusandae incidunt optio illum
							quaerat sapiente dolore nihil dolorem?</p>
					</div>
					<div class="card-action">
						<a href="#">링크1</a>
					</div>
				</div>
			</div>
		</div>
		<!-- end of Image Card -->

		<!-- Card Reveal -->
		<div class="row">
			<div class="col s12 m4">
				<div class="card">
					<div class="card-image waves-effect waves-block waves-light">
						<img class="activator" src="/resources/imgs/budapest.jpg">
					</div>
					<div class="card-content">
						<span class="card-title grey-text text-darken-4 activator"> 부다페스트 <i class="material-icons right">more_vert</i>
						</span>
						<p>
							<a href="#">링크 클릭하세요</a>
						</p>
					</div>
					<div class="card-reveal">
						<span class="card-title"> 부다페스트 <i class="material-icons right">close</i>
						</span>
						<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Molestias, ducimus. Laudantium soluta dignissimos ullam ad atque deserunt, a dolor nobis corporis incidunt voluptatum! Porro
							consequuntur quidem incidunt fuga impedit voluptate!</p>
					</div>
				</div>
			</div>
			<div class="col s12 m4">
				<div class="card">
					<div class="card-image waves-effect waves-block waves-light">
						<img class="activator" src="/resources/imgs/dresden.jpg">
					</div>
					<div class="card-content">
						<span class="card-title grey-text text-darken-4 activator"> 드라스덴 <i class="material-icons right">more_vert</i>
						</span>
						<p>
							<a href="#">링크 클릭하세요</a>
						</p>
					</div>
					<div class="card-reveal">
						<span class="card-title"> 드라스덴 <i class="material-icons right">close</i>
						</span>
						<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Molestias, ducimus. Laudantium soluta dignissimos ullam ad atque deserunt, a dolor nobis corporis incidunt voluptatum! Porro
							consequuntur quidem incidunt fuga impedit voluptate!</p>
					</div>
				</div>
			</div>
			<div class="col s12 m4">
				<div class="card">
					<div class="card-image waves-effect waves-block waves-light">
						<img class="activator" src="/resources/imgs/amsterdam.jpg">
					</div>
					<div class="card-content">
						<span class="card-title grey-text text-darken-4 activator"> 암스테르담 <i class="material-icons right">more_vert</i>
						</span>
						<p>
							<a href="#">링크 클릭하세요</a>
						</p>
					</div>
					<div class="card-reveal">
						<span class="card-title"> 암스테르담 <i class="material-icons right">close</i>
						</span>
						<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Molestias, ducimus. Laudantium soluta dignissimos ullam ad atque deserunt, a dolor nobis corporis incidunt voluptatum! Porro
							consequuntur quidem incidunt fuga impedit voluptate!</p>
					</div>
				</div>
			</div>
		</div>
		<!-- end of Card Reveal -->

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

		const slider = document.querySelector('.slider');
		M.Slider.init(slider, {
			indicators : false,
			height : 485,
			duration : 500,
			interval : 6000
		});

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

		var elems = document.querySelectorAll('.collapsible');
		var instances = M.Collapsible.init(elems, {});
	</script>
</body>

</html>