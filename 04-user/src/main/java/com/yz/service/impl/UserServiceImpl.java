package com.yz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yz.dao.UserMapper;
import com.yz.entity.User;
import com.yz.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(null);
	}
	@Override
	public Integer save(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
	}

}
