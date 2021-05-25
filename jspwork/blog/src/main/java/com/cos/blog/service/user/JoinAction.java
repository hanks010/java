package com.cos.blog.service.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.domain.board.BoardDAO;
import com.cos.blog.domain.user.User;
import com.cos.blog.domain.user.UserDAO;
import com.cos.blog.service.Action;
import com.cos.blog.util.Script;
import com.cos.blog.util.ValidationHandler;

public class JoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 유효성 검사 (username, password)
		// ?username=ssar, ?username= (공백), ? (널)

		// request.getParameterNames(); 함수 하나로 모듈화 가능 
//		if (request.getParameter("username") == null || request.getParameter("username").equals("")) {
//			System.out.println("username 정확히 입력");
//			return;
//		} else if (request.getParameter("password") == null || request.getParameter("password").equals("")) {
//			System.out.println("password 정확히 입력");
//			return;
//		} else if (request.getParameter("email") == null || request.getParameter("email").equals("")) {
//			System.out.println("email 정확히 입력");
//			return;
//		} else if (request.getParameter("address") == null || request.getParameter("address").equals("")) {
//			System.out.println("address 정확히 입력");
//			return;
//		}
		ValidationHandler vh = new ValidationHandler();
		List<String> keys = Arrays.asList("username", "password", "email", "address");

		int val_data = vh.validation(keys, request, response);
		if (val_data == -1) {
			Script.back("회원가입 실패", response);
			return;
		}

		// 2. Http Body 데이터 변수로 받아야 됨.
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		User user = new User(null, username, password, email, address, null);

		// 3. DAO 연결해서 save() 메소드 호출
		// 4. result 받아야 함
		UserDAO userDAO = UserDAO.getInstance();
		int result = userDAO.save(user);

		// 5. 1일 때, 1이 아닐 때를 분기하여 1일 때는 loginForm 페이지로 보내기, 1이 아니면 joinForm 페이지로 보내기
		if (result == 1) {
			// System.out.println("회원가입 성공 DB를 확인하세요");
			// Content-Type :text/html; charset=utf-8 =>파일을 리턴할 때는 기본적으로 utf-8 타입
			response.sendRedirect("views/user/loginForm.jsp"); // 파일을 리턴
		} else {
			// System.out.println("회원가입 실패 Console에 오류를 확인하세요");
			// 파일로 응답이 아닐 때에는 utf-8이 아님
			Script.back("회원가입 실패", response);
		}
	}

}
