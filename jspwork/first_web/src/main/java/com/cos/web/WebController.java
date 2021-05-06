package com.cos.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//HttpServlet은 클래스를 서블릿 파일로 만들어준다
//서블릿 파일은 자바코드에서 HTML 코드를 PrintWriter를 달아서 응답
public class WebController extends HttpServlet {

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doDelete");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPut");
	}

}
