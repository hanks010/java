package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8000/blog/UserController -> http://localhost:8000/blog/user
@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. null과 공백 접근 금지(유효성 검사)

		// request.setCharacterEncoding("utf-8"); //던진 데이터를 3바이트씩 파싱, Controller에 넣으면 매번
		// 넣어줘야 함 -> web.xml의 filter로 처리
		if (request.getParameter("cmd") == null || request.getParameter("cmd").equals("")) {
			return;
		}
		String cmd = request.getParameter("cmd");

		if (cmd.equals("joinForm")) { // 조인폼태그 페이지를 달라 //form 적혀있으면 sendRedirect

		} else if (cmd.equals("join")) {// 로그인폼 태그 페이지를 달라

		} else if (cmd.equals("loginForm")) {

		} else if (cmd.equals("login")) {

		} else if (cmd.equals("updateForm")) {

		} else if (cmd.equals("update")) {

		} else if (cmd.equals("logoutForm")) {

		} else if (cmd.equals("logout")) {

		}

	}

}
