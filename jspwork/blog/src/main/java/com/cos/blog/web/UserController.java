package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.service.Action;
import com.cos.blog.service.user.JoinAction;
import com.cos.blog.service.user.JoinFormAction;
import com.cos.blog.service.user.loginAction;
import com.cos.blog.service.user.loginFormAction;
import com.cos.blog.service.user.logoutAction;
import com.cos.blog.service.user.updateAction;
import com.cos.blog.service.user.updateFormAction;

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
		Action action = router(cmd);
		if (action != null) {
			action.execute(request, response); // 다형성, 안의 객체가 어떤지에 따라 자식 객체의 것이 실행됨
		}
	}
	//router에게 객체 생성을 위임하고 결과를 응답받음 (팩토리 패턴)
	private Action router(String cmd) {
		if (cmd.equals("joinForm")) { // 조인폼태그 페이지를 달라 //form 적혀있으면 sendRedirect
			return new JoinFormAction(); // 다른 클래스에 위임하고 리턴 받는다 -> 팩토리 패턴
		} else if (cmd.equals("join")) { // 분기시켜서 일을 처리
			return new JoinAction();
		} else if (cmd.equals("loginForm")) { // 로그인폼 태그 페이지를 달라
			return new loginFormAction();
		} else if (cmd.equals("login")) {
			return new loginAction();
		} else if (cmd.equals("updateForm")) {
			return new updateFormAction();
		} else if (cmd.equals("update")) {
			return new updateAction();
		} else if (cmd.equals("logout")) {
			return new logoutAction();
		}
		return null;
	}

}
