package com.gongkongmall.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gongkongmall.user.mapper.UserMapper;
import com.gongkongmall.user.model.User;

@Repository
public class UserDao {

	@Autowired
	private UserMapper mapper;
	
	public void create(User user){
		mapper.insert(user);
	}
	
	public List<User> selectTopN(int topNum){
		return mapper.selectTopN(topNum);
	}
	
}
