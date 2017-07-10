package com.gongkongmall.user.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gongkongmall.user.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:application-context-test.xml",
        "classpath:data-source-test.xml"})
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;

	@Test
	public void test() {
		assertNotNull(userMapper);
		
		User user = new User();
		user.setAge(30);
		user.setUserName("xiushu");
		
		assertEquals(0, user.getId());
		userMapper.insert(user);
		assertNotEquals(0, user.getId());
	
	}
	
	@Test
	public void testTopN(){
		List<User> users = userMapper.selectTopN(5);
		assertEquals(5, users.size());
	}

}
