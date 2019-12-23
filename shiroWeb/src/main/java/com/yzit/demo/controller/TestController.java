package com.yzit.demo.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequiresRoles("adminRole")
	@GetMapping("/amdin/enter")
	public String adminLogin() {
		return "管理员进入";
	}

	@GetMapping("/test")
	public String test() {
		return "测试";
	}

	@RequiresRoles("adminRole")
	@GetMapping("/index")
	public String index() {
		return "首页";
	}

	@GetMapping("/login")
	public String login() {
		return "登录";
	}
	@RequiresPermissions("user:list")
	@GetMapping("/user/list")
	public String userList() {
		return "用户列表";
	}
	@RequiresPermissions("user:add")
	@GetMapping("/user/add")
	public String userAdd() {
		return "添加用戶";
	}
	
	@RequiresPermissions("user:del")
	@GetMapping("/user/del")
	public String userDel() {
		return "刪除用戶";
	}
}
