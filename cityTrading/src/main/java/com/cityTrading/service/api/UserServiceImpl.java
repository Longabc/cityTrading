package com.cityTrading.service.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cityTrading.dao.UserDao;
import com.cityTrading.domain.User;
import com.cityTrading.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao UserDao;
	
	@Override
	public User findById(Long id) {
		return UserDao.findById(id);
	}

	@Override
	public Boolean checkLogin(HttpServletRequest request, String username,
			String pwd) {
		Object object = request.getSession().getAttribute("user");
		if (null == object) {
			return false;
		}
		return true;
	}

	@Override
	public boolean checkUserByUsernameAndPassword(HttpServletRequest request,
			String username, String pwd) {
		User user = UserDao.findUserByUsernameAndPassword(username, pwd);
		if (null == user) {
			return false;
		}
		request.getSession().setAttribute("user", user);
		return true;
	}
	
}
