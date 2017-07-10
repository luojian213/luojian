package com.gongkongmall.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gongkongmall.user.dao.UserDao;
import com.gongkongmall.user.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void register(User user){
		userDao.create(user);
	}
	
	public List<User> selectTopN(int topNum){
		return userDao.selectTopN(topNum);
	}
}
