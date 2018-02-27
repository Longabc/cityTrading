package com.cityTrading.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cityTrading.service.UserService;
import com.cityTrading.util.BaseResult;
import com.cityTrading.util.StatusEnum;

@RequestMapping("/manager")
@Controller
public class indexControl {

	@Autowired
	private UserService UserService;
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request, String username,String pwd) {
		Boolean checkLogin = UserService.checkLogin(request, username, pwd);
		if (false == checkLogin) {
			return "manager/login";
		}
		return "manager/index";
	}
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "manager/login";
	}
	
	
	@RequestMapping("/login")
	@ResponseBody
	public BaseResult login(HttpServletRequest request,String username,String pwd) {
		
		//TODO 参数判断
		boolean flag = UserService.checkUserByUsernameAndPassword(request, username, pwd);
		if (flag == true) {
			return new BaseResult(StatusEnum.SUCCESS);
		}
		return new BaseResult(StatusEnum.ERROR);
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		if (null == request.getSession().getAttribute("user")) {
			return "manager/login";
		}
		request.getSession().removeAttribute("user");
		return "manager/login";
	}
}
