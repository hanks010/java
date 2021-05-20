package com.cos.blog.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action { //메소드 이름이 계속 바뀔 수 있기 때문에 인터페이스 생성해서 처리
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;
	
}
