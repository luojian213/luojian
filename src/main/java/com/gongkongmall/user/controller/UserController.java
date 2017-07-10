package com.gongkongmall.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gongkongmall.user.model.User;
import com.gongkongmall.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@ModelAttribute("model") ModelMap model) {

		List<User> userList = userService.selectTopN(10);
		model.addAttribute("userList", userList);
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		userService.register(user);
		return "redirect:index.html";
	}
}
