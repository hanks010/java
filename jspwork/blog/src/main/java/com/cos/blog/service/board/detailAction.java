package com.cos.blog.service.board;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.domain.board.BoardDAO;
import com.cos.blog.service.Action;
import com.cos.blog.util.Script;
import com.cos.blog.util.ValidationHandler;
import com.cos.blog.web.dto.BoardDetailDTO;

public class detailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<String> keys = Arrays.asList("id"); // 키 값만 다름

		ValidationHandler vh = new ValidationHandler();
		int val_data = vh.validation(keys, request, response);
		if (val_data == -1) {
			Script.back("올바르게 입력", response);
			return;
		}
		// 세션 확인 필요없음
		// 필요한 아이디의 게시글만 상세보기

		int id = Integer.parseInt(request.getParameter("id"));

		BoardDAO boardDAO = BoardDAO.getInstance();
		BoardDetailDTO boardDetailDTO = boardDAO.mDetail(id);

		if(boardDetailDTO != null) {
			request.setAttribute("dto", boardDetailDTO);
		//request.setAttribute("board", boardEntity);
		RequestDispatcher dis = request.getRequestDispatcher("views/board/detail.jsp");
		dis.forward(request, response);
		}else {
			Script.back("잘못된 접근입니", response);
		}
		// response.sendRedirect("views/board/home.jsp");

	}

}
