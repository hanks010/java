package com.cos.blog.service.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.service.Action;

public class JoinFormAction implements Action{
//	public void start(HttpServletRequest request, HttpServletResponse response) {
//	//처리!
//}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("views/user/joinForm.jsp"); //sendredirect, 디스패쳐 모두 jsp 파일을 찾음, 디폴트 경로가 wepapp
	}

}
