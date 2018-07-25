package com.tonkia.spring.data;

import com.tonkia.spring.vo.UserInfo;

public interface UserMapper {
	public UserInfo getUserInfoByAccount(String account);

	public int addUserInfo(UserInfo ui);
}
