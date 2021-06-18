package com.example.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.UserVO;

public interface UserMapper {

	@Insert("INSERT INTO user_tbl(id, passwd) VALUES(#{id},#{passwd})")
	int insertUser(UserVO userVO);
	
	@Select("SELECT * FROM user_tbl WHERE id=#{id}")
	UserVO getUserById(int id);
	
	@Update("UPDATE user_tbl set passwd = #{passwd} WHERE id = #{id}")
	void updateUserById();
	
	@Delete("DELETE FROM user_tbl WHERE id = #{id}")
	int deleteUserById();
	
	
}
