package com.cos.blog.util;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidationHandler {

	// Don't Repeat Yourself => DRY하게 코드 짜세요! => 두 번 일 하지마라
	public int validation(List<String> keys, HttpServletRequest request, HttpServletResponse response) { // static 쓰면
																											// 공유하기 때문에
																											// 충돌나서 안됨
		Enumeration<String> e = request.getParameterNames();
		int count = 0;
		// username =
		// username = ssar&password
		// 키 값의 개수 & null인지 검증
		//e.hasMoreElements()를 한 번 돌면 두 번째는 실행이 안됨
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			if (key.equals("cmd")) {
				continue;
			}
			if (keys.contains(key) == false) { //정확하지 않은 키 값일 때 
				System.out.println("정확한 키 값을 입력하세요");
				return -1;
			} else if (request.getParameter(key).equals("")) { //값이 공백일 때
				System.out.println(key + "값이 공백입니다");
				return -1;
			}
			count++;
		}
		if (keys.size() != count) {	//키 값이 널일 때
			System.out.println("모든 값을 입력하세요");
			return -1;
		}
		return 1;
	}
}
