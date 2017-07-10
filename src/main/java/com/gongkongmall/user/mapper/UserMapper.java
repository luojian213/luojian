package com.gongkongmall.user.mapper;

import java.util.List;

import com.gongkongmall.user.model.User;

public interface UserMapper {
    int deleteById(long id);

    int insert(User user);

    int insertSelective(User user);

    User selectById(long id);

    int updateByIdSelective(User user);

    int updateById(User user);
    
    List<User> selectTopN(int topNum);
}