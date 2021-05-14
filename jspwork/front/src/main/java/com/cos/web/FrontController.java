package com.cos.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getMethod() + "요청 옴: " + request.getRequestURI());

		String cmd = request.getParameter("cmd"); // QueryString, x-www-form-urlencoded (Key=Value)
		System.out.println("cmd: " + cmd);
			
			
			//DB 연결
			//문자 인코딩
			//을 한 페이지에서 모아서 한 뒤 전달해준다
			//이 페이지는 뷰의 역할만 해준다
			//CV패턴 - Controller와 View 역할
		
			if(request.getParameter("cmd")==null){
				return;
			}
			if (cmd.equals("a")) {
				response.sendRedirect("a.jsp");
			}
			else if (cmd.equals("b")) {
				response.sendRedirect("b.jsp");
			}
			else if (cmd.equals("c")) {
				int money = 10000;
				//response.sendRedirect("c.jsp");
				request.setAttribute("money", money);
				RequestDispatcher dis = request.getRequestDispatcher("c.jsp");
				dis.forward(request, response);
			}
			else { //널이거나 공백,cmd=asdfs
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('Bad Request')");
				out.println("</script>");
			}
		}

}