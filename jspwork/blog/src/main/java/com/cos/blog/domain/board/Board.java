package com.cos.blog.domain.board;

import java.sql.Timestamp;

public class Board { // N, 1 ->외래키 존재
	private int id; //Primary Key, Sequence
	private String title;
	private String content;
	private Timestamp created; 
	private int userId;
	
	Board(){};
	
	public Board(int id, String title, String content, Timestamp created, int userId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.created = created;
		this.userId = userId;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
