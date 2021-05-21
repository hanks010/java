package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.service.Action;
import com.cos.blog.service.board.deleteAction;
import com.cos.blog.service.board.detailAction;
import com.cos.blog.service.board.homeAction;
import com.cos.blog.service.board.saveAction;
import com.cos.blog.service.board.saveFormAction;
import com.cos.blog.service.board.searchAction;
import com.cos.blog.service.board.updateAction;
import com.cos.blog.service.board.updateFormAction;

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
		Action action = router(cmd);
		if (action != null) {
			action.execute(request, response);
		}

	}

	// httpL//localhost:8000/blog/board?cmd=home
	private Action router(String cmd) {
		if (cmd.equals("home")) { // 메인페이지
			return new homeAction();
		} else if (cmd.equals("detail")) {// 게시글 상세보기
			return new detailAction();
		} else if (cmd.equals("delete")) {
			return new deleteAction();
		} else if (cmd.equals("updateForm")) {
			return new updateFormAction();
		} else if (cmd.equals("update")) {
			return new updateAction();
		} else if (cmd.equals("saveForm")) {
			return new saveFormAction();
		} else if (cmd.equals("save")) {
			return new saveAction();
		} else if (cmd.equals("search")) {
			return new searchAction();
		}
		return null;
	}

}