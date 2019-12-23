package com.yz.service;

import java.util.List;

import com.yz.entity.User;

public interface IUserService {

	List<User> findAll();

	Integer save(User user);

}
