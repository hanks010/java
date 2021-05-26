package com.cos.blog.service.user;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.blog.domain.user.User;
import com.cos.blog.domain.user.UserDAO;
import com.cos.blog.service.Action;
import com.cos.blog.util.Script;
import com.cos.blog.util.ValidationHandler;

public class loginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ValidationHandler vh = new ValidationHandler();
		List<String> keys = Arrays.asList("username", "password");

		int val_data = vh.validation(keys, request, response);
		if (val_data == -1) {
			// response.sendRedirect("views/user/joinForm.jsp");
			Script.back("로그인 실패", response);
			return;
		}

		// 2. Http Body 데이터 변수로 받아야 됨.
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// 3. DAO 연결해서 findByUsernameAndPassword 호출
		// 4. result 받아야 함
		UserDAO userDAO = UserDAO.getInstance();
		// entity는 데이터베이스와 동기화된(데이터가 일치하는) User 오브젝트
		User userEntity = userDAO.findByUsernameAndPassword(username, password); // select 해서 쿼리 확인 후 객체 가져옴

		if (userEntity != null) {
			// 쿠키 담는 코드
			// 체크가 되었고, 로그인이 완료되었으면 => response의 HTTPHeader에 Cookie를 저장해서 날림 
			//값은 id를 가지고 있으면 됨 ex) rememberMe = ssar 
			//여기서는 이까지
			
			//브라우저는 항상 request 요청 시마다 쿠키값을 자동으로 헤더에 담아서 전송한다
			//쿠키에서 rememberMe가 있는지 확인
			//서버는 쿠키에 접근해서 rememberMe값을 가져와서 변수에 저장한다 => 여기까지는 loginForm에서 requestDispacher로 가지고 감
			//redirect해도 됨(브라우저가 쿠키를 가지고 있으니까)
			
			System.out.println("로그인 성공");
			//리퀘스트는 context, 모든 정보를 다 들고 있다. 리퀘스트를 통해 세션 메모리 공간에 접근 후 setAttributed로 값을 넣음
			HttpSession session = request.getSession(); // jsp에서는 session 바로 접근 가능
			// ${principal} => null이 아니면 접근 가능
			session.setAttribute("principal", userEntity); // principal - 접근주체, 인증주체
			// session.invalidate(); 로그아웃 코드
			response.sendRedirect("/blog"); // 파일을 리턴
		} else {
			System.out.println("로그인 실패");
			Script.back("로그인 실패", response);
		}
	}

}
