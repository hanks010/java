package com.cos.blog.service.board;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.blog.domain.board.Board;
import com.cos.blog.domain.board.BoardDAO;
import com.cos.blog.domain.user.User;
import com.cos.blog.service.Action;
import com.cos.blog.util.Script;
import com.cos.blog.util.ValidationHandler;

public class saveAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세션 체크 해줘야함, 공통 로직 시작
		HttpSession session = request.getSession();
		User principal = (User) session.getAttribute("principal");

		if (principal == null) {
			Script.href("로그인을 먼저 진행해주세요", response);
			return;
		}
		System.out.println("session ok");
		// 반복됨, DRI하게

		ValidationHandler vh = new ValidationHandler();
		List<String> keys = Arrays.asList("title", "content"); // 키 값만 다름

//		int val_data = vh.validation(keys, request, response);
//		if (val_data == -1) {
//			Script.back("올바르게 입력", response);
//			return;
//		}
		// 공통 로직 끝

		// 핵심로직
		// 글을 DB에 INSERT 하기
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Board board = new Board();
		System.out.println("11");
		//Board board = new Board(null, title, content, null, null);
		board.setTitle(title);
		board.setContent(content);
		board.setUserId(principal.getId());
		BoardDAO boardDAO = BoardDAO.getInstance();
		int result = boardDAO.save(board);
		System.out.println("result: "+result);
		// 공통 로직 시작
		// 로그 남기고, 특정페이지로 이동
		if (result == 1) {
			response.sendRedirect("/blog");
		} else {
			Script.back("글쓰기 실패", response);
		}

		// 공통 로직 끝

	}

}
