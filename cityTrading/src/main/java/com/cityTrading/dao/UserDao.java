package com.cityTrading.dao;

import com.cityTrading.domain.User;

public interface UserDao extends BaseDao<User, Long>{

	User findById(Long id);
	
	User findUserByUsernameAndPassword(String username,String pwd);
}
