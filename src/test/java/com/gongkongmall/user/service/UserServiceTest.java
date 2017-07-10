package com.gongkongmall.user.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gongkongmall.user.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:application-context-test.xml"
        })
public class UserServiceTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testRegister() {
		assertNotNull(userService);
		
		User user = new User();
		user.setAge(30);
		user.setUserName("xiushu");
		
		assertEquals(0, user.getId());
		userService.register(user);
		assertNotEquals(0, user.getId());
	}

}
