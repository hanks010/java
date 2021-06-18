package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.UserVO;
import com.example.service.UserService;

import lombok.Setter;

@RequestMapping("/user/*")
@Controller
public class UserController {

	@Setter(onMethod_ = @Autowired)
	private UserService userService;

	@GetMapping("/index")
	public String index() {
		return "user/index";
	}
	@GetMapping("/join")
	public String join() {
		return "user/join";
	}

	@PostMapping("/join")
	public String join(UserVO userVO) {

		userService.registerUser(userVO);
		return "redirect:/user/login";
	}

	@GetMapping("/login")
	public String login() {
		return "user/login";
	}

	@PostMapping("/login")
	public String login(int id, String passwd, HttpSession session) {
		UserVO userVO = userService.getUserById(id);
		boolean isSamePasswd = passwd.equals(userVO.getPasswd());

		if (userVO != null && isSamePasswd) {
			session.setAttribute("userVO", userVO);
			return "redirect:/user/index";
		}

		return "redirect:/user/login";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();

		return "redirect:/user/login";
	}

	@GetMapping("/list")
	public String list() {
		return "board/boardList";
	}

}
