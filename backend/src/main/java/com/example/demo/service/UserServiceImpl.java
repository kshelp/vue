package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserMapper;
import com.example.demo.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper uMapper;

	@Override
	public boolean login(String userId, String userPw) {
		// TODO Auto-generated method stub
		UserDto user = uMapper.selectOneUser(userId);
		if (user != null) {
			if (user.getUserPw().equals(userPw)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean join(UserDto user) {
		// TODO Auto-generated method stub
		if (uMapper.selectOneUser(user.getUserId()) == null) {
			uMapper.insertUser(user);
			return true;
		}
		return false;
	}

	@Override
	public void modify(UserDto user) {
		// TODO Auto-generated method stub
		uMapper.updateUser(user);
	}

	@Override
	public void withdraw(String userId) {
		// TODO Auto-generated method stub
		uMapper.deleteUser(userId);
	}

	@Override
	public UserDto getUser(String userId) {
		// TODO Auto-generated method stub
		return uMapper.selectOneUser(userId);
	}

	@Override
	public List<UserDto> getUserList() {
		// TODO Auto-generated method stub
		return uMapper.selectAllUser();
	}

}
