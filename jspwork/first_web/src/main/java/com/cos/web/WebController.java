package com.cos.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//HttpServlet은 클래스를 서블릿 파일로 만들어준다
//서블릿 파일은 자바코드에서 HTML 코드를 PrintWriter를 달아서 응답
public class WebController extends HttpServlet {

	//request, response 객체는 톰켓이 만들어준다
	//1. request  // 클라이언트의 요청에 관한 정보 저장
	//2. response //누구한테 응답할 지 정함
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doDelete");
		resp.sendRedirect("home.jsp");
	}
	// GET http://localhost:8000/first_web/test 
	// /*로 하면 파일로 응답이 안됨 모두 필터에 걸러지기 때문 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
		
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(resp.getOutputStream()));
		//PrintWriter pw = new PrintWriter(resp.getOutputStream());
		resp.setCharacterEncoding("utf-8"); //3바이트씩 끊어서 버퍼에 준다
		int num = 10;
		PrintWriter out = resp.getWriter(); //PrintWriter를 반환
		//MIME 타입!

		resp.setContentType("text/plain; charset=utf-8"); //버퍼에서 3바이트씩 끊어서 읽도록 함
		//요청한 사람에게 어떤 타입인지 알려줌
		resp.setHeader("Content-Type", "text/plain; charset=utf-8");
		resp.setHeader("hello","haha"); //프로토콜이 없어서 새로운 키값을 만들어도 브라우저(응답자)가 이해하기 어렵다, 무시한다
						//키값, 데이터값
						//브라우저는 프로토콜을 지켜서 읽는다
		resp.setHeader("ya","mohe");
		out.println("<html>");
		out.println("<html>");
		out.println("<h1>한글"+num+"</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
		resp.sendRedirect("home.jsp");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPut");
	}

}
