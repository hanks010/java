package com.cos.blog.domain.board;

import java.util.List;

import com.cos.blog.web.dto.BoardDetailDTO;

public class BoardDAO {
	
	//상세보기 시 Board 정보와 User 정보를 조인해서 가져올 함수
	public BoardDetailDTO mDetail(int id) {
		return null;
	}
	//get
	public Board findById(int id) { // id로 select 한 건 찾기
		return null;
	}
	//get
	public List<Board> findAll() {
		return null;
	}
	//post
	public int save(Board board) {
		return -1;
	}
	//post
	public int update(Board board) {
		return -1;
	}
	//post
	public int deleteById(int id) { // id로 삭제
		return -1;
	}
}
