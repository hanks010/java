package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardController() {

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
		
		//httpL//localhost:8000/blog/board?cmd=home

		if (cmd.equals("home")) { //메인페이지 

		} else if (cmd.equals("detail")) {// 게시글 상세보기 

		} else if (cmd.equals("delete")) { 

		} else if (cmd.equals("updateForm")) {

		} else if (cmd.equals("update")) {

		} else if (cmd.equals("saveForm")) {

		} else if (cmd.equals("save")) {

		}else if (cmd.equals("search")) {

		}


	}

}
