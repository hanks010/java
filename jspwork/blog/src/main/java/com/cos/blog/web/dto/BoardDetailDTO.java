package com.cos.blog.web.dto;

public class BoardDetailDTO {
	//화면에 필요한 거 생각하고 적으면 됨, 데이터베이시킴
	private Integer id;
	private String title;
	private String content;
	private Integer userId;
	private String username;
	private String created;
	public BoardDetailDTO() {};
	public BoardDetailDTO(Integer id, String title, String content, Integer userId, String username, String created) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.userId = userId;
		this.username = username;
		this.created = created;
		
	}
	

	@Override
	public String toString() {
		return "BoardDetailDTO [id=" + id + ", title=" + title + ", content=" + content + ", userId=" + userId
				+ ", username=" + username + ", created=" + created + "]";
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}
}
