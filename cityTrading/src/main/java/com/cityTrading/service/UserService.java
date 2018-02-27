package com.cityTrading.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.cityTrading.domain.User;

public interface UserService {

	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	User findById(Long id);
	
	/**
     * 检查是否已经登录
     * @param request
     * @param username
     * @param pwd
     * @return
     */
	Boolean checkLogin(HttpServletRequest request, String username, String pwd);
	
	/**
	 * 是否登录成功
	 * @param usernameString
	 * @param pwd
	 * @return
	 */
	boolean checkUserByUsernameAndPassword(HttpServletRequest request,String username , String pwd);
}
