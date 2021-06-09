package com.test.studying.dao;

import java.util.List;

import com.test.studying.dto.UserDto;

public interface UserDao {

	List<UserDto> selectUser() throws Exception;

	int insertUser(UserDto user);
	
}
