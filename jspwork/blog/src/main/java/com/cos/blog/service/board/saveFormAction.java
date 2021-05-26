package com.cos.blog.service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.blog.domain.user.User;
import com.cos.blog.service.Action;
import com.cos.blog.util.Script;

public class saveFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세션 검증 후 리다이렉트 또는 스크립트문
		HttpSession session = request.getSession();
		User userEntity = (User) session.getAttribute("principal");
		if (userEntity != null) {
			response.sendRedirect("views/board/saveForm.jsp");
		} else {
			Script.href("로그인 해주세요", response);
		}
	}
}
