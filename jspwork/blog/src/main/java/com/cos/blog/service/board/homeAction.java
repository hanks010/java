package com.cos.blog.service.board;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
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

public class homeAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		BoardDAO boardDAO = BoardDAO.getInstance();
		List<Board> boardsEntity = boardDAO.findAll();
		//세션에 담으면 안됨
		System.out.println(boardsEntity.size());
		
		request.setAttribute("boards", boardsEntity);
		RequestDispatcher dis = request.getRequestDispatcher("views/board/home.jsp");
		dis.forward(request,response);
		
		//response.sendRedirect("views/board/home.jsp");
		
	
	}

}
