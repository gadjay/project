package com.test.dao;

import java.util.List;

import com.test.entity.User;

public interface UserDao{
	public List<User> findAll(Integer temp);
	
	public List<User> findAlls(Integer temp);
}
