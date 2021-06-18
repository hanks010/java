package com.example.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.UserVO;

import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class UserServiceTests {

	@Setter(onMethod_ = @Autowired)
	private UserService userService;
	
	@Test
	public void testRegister() {
		UserVO userVO = new UserVO();
		userVO.setId(2);
		userVO.setPasswd("1234");
		
		int rowCount = userService.registerUser(userVO);
		assertEquals(1, rowCount);
		
	}
}
