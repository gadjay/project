package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.entity.User;
import com.test.service.UserService;

@Controller  
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String showInfo(HttpServletRequest request, HttpServletResponse response,Integer temp){
		
		List<User> userList = userService.findAlls(temp);
		request.setAttribute("userList", userList);
		return "user";
	}
	
	@RequestMapping("/text")
	public String showInfos(HttpServletRequest request, HttpServletResponse response,Integer temp){
		
		List<User> userList = userService.findAll(temp);
		request.setAttribute("userList", userList);
		return "user";
	}
}
