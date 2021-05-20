package com.cos.blog.domain.user;

import java.util.List;

import com.cos.blog.domain.board.Board;

public class UserDAO { 

	public User findByUsernameAndPassword(String username, String password) {
		return null;
	}

	// get
	public User findById(int id) { // id로 select 한 건 찾기
		return null;
	}

	// get
	public List<User> findAll() {
		return null;
	}

	// post
	public int save(User user) {
		return -1;
	}

	// post
	public int update(User user) {
		return -1;
	}

	// post
	public int deleteById(int id) { // id로 삭제
		return -1;
	}

}
