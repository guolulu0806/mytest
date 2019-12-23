package com.yz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yz.entity.User;
import com.yz.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	@GetMapping("user")
	public List<User> list(){
		return userService.findAll();
	}
	
	@PostMapping("save")
	private Integer save(@RequestBody User user) {
		return userService.save(user);
	}

}
