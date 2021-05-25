package com.cos.blog.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Script {

	public static void back(String msg, HttpServletResponse response) throws IOException{
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); //버퍼를 만들어줌, //자동 flush 해줌
		out.println("<script> ");
		out.println("alert('"+msg+"');"); //history.back 이전 페이지로 돌아감, 적은 거 다 남아있음
		out.println("history.back()");
		out.println("</script> "); //스크립트를 리턴, 버퍼를 달아 리턴
		//location.href ="" -> contextPath부터 적어줘야함
		//response.sendRedirect("views/user/joinForm.jsp");
	}
	public static void href(){
		
	}
}
