package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<User> findAll(Integer temp){
		return userDao.findAll(temp);
	}
	
	public List<User> findAlls(Integer temp){
		return userDao.findAlls(temp);
	}
}
