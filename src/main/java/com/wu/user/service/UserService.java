package com.wu.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wu.common.data.Result;
import com.wu.user.bean.User;
import com.wu.user.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public Result regist(User user) {
		user.setId(10);
		User save = userDao.save(user);
		return Result.success(save);
	}
	
	
	public Result getAllUser() {
		List<User> findAll = userDao.findAll();
		return Result.success(findAll);
	}
}
