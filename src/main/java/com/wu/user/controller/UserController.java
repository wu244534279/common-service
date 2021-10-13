package com.wu.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wu.common.data.Result;
import com.wu.user.bean.User;
import com.wu.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("test")
	public String test() {
		return "success";
	}
	@GetMapping("findAll")
	public Result findAll() {
		return userService.getAllUser();
	}
	@PostMapping("regist")
	public Result regist(User user) {
		return userService.regist(user);
	}
	
	
	@PostMapping("login")
	public Object login() {
		return null;
	}
	
	
	@PostMapping("logout")
	public Object logout() {
		return null;
	}
	
	
	@PostMapping("modify")
	public Object modify() {
		return null;
	}
}
