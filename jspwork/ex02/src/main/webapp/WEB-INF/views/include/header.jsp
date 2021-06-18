<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Container -->
        <div class="container">

            <!-- Navbar -->
            <nav>
                <div class="nav-wrapper cyan">
                    <a href="/user/index" class="brand-logo">Logo</a>
                    <a href="#" data-target="nav-mobile" class="sidenav-trigger">
                        <i class="material-icons">menu</i>
                    </a>
                    <ul class="right hide-on-med-and-down">
                        <li><a href=/user/join>회원가입</a></li>
                        <li><a href="/user/login">로그인</a></li>
                        <li><a href="/user/list">게시판</a></li>
                    </ul>
                </div>
            </nav>
            <ul id="nav-mobile" class="sidenav">
                <li>
                    <div class="user-view">
                        <div class="background">
                            <img src="/resources/imgs/rome.jpg">
                        </div>
                        <a href="#user"><img src="/resources/imgs/venezia.jpg" class="circle"></a>
                        <a href="#name"><span class="white-text name">홍길동</span></a>
                        <a href="#email"><span class="white-text email">honggildong@gmail.com</span></a>
                    </div>
                </li>
                <li><a href="/user/join">회원가입</a></li>
                <li><a href="/user/login">로그인</a></li>
                <li><a href="/user/list">게시판</a></li>
            </ul>
            <!-- end of Navbar -->
