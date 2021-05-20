package com.cos.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hell")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontController() {
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
		request.setCharacterEncoding("euc-kr");
		System.out.println(request.getMethod() + " 요청옴");
		String id = request.getParameter("id");

		if (request.getParameter("id") == null) {
			PrintWriter out = response.getWriter();
			System.out.println("널값");
			out.println("<script>");
			out.println("alert('null값')");
			out.println("</script>");
			return;
		} else if (id.equals("a")) {
			PrintWriter out = response.getWriter();
			System.out.println("a 출력");
			out.print("a 출력");
		} else if (id.equals("b")) {
			response.sendRedirect("b.jsp");
		} else if (id.equals("c")) {
			int money = 100000;
			request.setAttribute("money", money);
			RequestDispatcher dis = request.getRequestDispatcher("c.jsp");
			dis.forward(request, response);
		} else {
			PrintWriter out = response.getWriter();
			System.out.println(" 다른 값 입력");
			out.print("다른 값 입력");
		}
		}

}