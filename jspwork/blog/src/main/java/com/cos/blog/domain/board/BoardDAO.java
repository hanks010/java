package com.cos.blog.domain.board;

import java.util.List;

import com.cos.blog.domain.CrudDAO;
import com.cos.blog.domain.user.UserDAO;
import com.cos.blog.web.dto.BoardDetailDTO;

public class BoardDAO implements CrudDAO<Board>{
	
	private static BoardDAO instance = new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		return instance;
	}
	
	//상세보기 시 Board 정보와 User 정보를 조인해서 가져올 함수
	public BoardDetailDTO mDetail(Integer id) {
		return null;
	}

	@Override
	public Board findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Board data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Board data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
