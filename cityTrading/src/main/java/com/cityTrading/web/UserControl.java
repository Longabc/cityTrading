package com.cityTrading.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cityTrading.dao.UserDao;
import com.cityTrading.domain.User;

@RequestMapping("/user")
@RestController
public class UserControl {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		return user;
	}
	
	@RequestMapping("/test")
	public String test(Integer id) {
		System.out.println(id);
		return id.toString();
	}
	
	@RequestMapping("/createUser")
	public String createUser() {
		return "成功创建一个新用户了";
	}
}
