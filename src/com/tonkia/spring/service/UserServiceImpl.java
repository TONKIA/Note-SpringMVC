package com.tonkia.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tonkia.spring.data.UserMapper;
import com.tonkia.spring.vo.UserInfo;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public UserInfo getUserInfoByAccount(String account) {
		return userMapper.getUserInfoByAccount(account);
	}

	@Override
	public int registerUserInfo(UserInfo ui) {
		return userMapper.addUserInfo(ui);
	}

}
