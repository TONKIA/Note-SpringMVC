package com.tonkia.spring.service;

import com.tonkia.spring.vo.UserInfo;

public interface UserService {
	public UserInfo getUserInfoByAccount(String account);

	public int registerUserInfo(UserInfo ui);
}
