package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.UserVO;
import com.example.mapper.UserMapper;

import lombok.Setter;

@Service
@Transactional
public class UserService {
	
	@Setter(onMethod_= @Autowired)
	private UserMapper userMapper;
	
	public int registerUser(UserVO userVO) {
		return userMapper.insertUser(userVO);
	}
	public UserVO getUserById(int id) {
		return userMapper.getUserById(id);
	}
	public void modifyUserById() {
		userMapper.updateUserById();
	}
	public int removeUserById() {
		return userMapper.deleteUserById();
	}
	
}
