package com.cos.blog.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cos.blog.config.DBConn;
import com.cos.blog.domain.board.Board;
import com.cos.blog.domain.user.User;

public interface CrudDAO<T> {
	//get
		public Board findById(Integer id);  // id로 select 한 건 찾기
			
		//get
		public List<T> findAll();
		//post
		public int save(T data);
		//post
		public int update(T data);
		//post
		public int deleteById(Integer id); // id로 삭제
			
}
