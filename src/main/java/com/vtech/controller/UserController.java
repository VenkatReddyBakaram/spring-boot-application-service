package com.vtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vtech.models.User;
import com.vtech.service.UserService;

@Controller
@RequestMapping("user/")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "login", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public User login(@RequestBody User user) {
		userService.validateUser(user);
		System.out.println("login() method working");
		return user;
	}

	@RequestMapping(value = "signIn", method = RequestMethod.GET)
	public String signIn() {
		return "signin";
	}

	@RequestMapping("verifyUser")
	public String verifyUser(@RequestParam String userName, @RequestParam String email, @RequestParam String password,
			@RequestParam String phoneNumber) {

		return userService.verifyUser(userName, password);
	}

	@RequestMapping(value = "validateSignIn", method = RequestMethod.POST)
	public String validateSignIn(User user) {
		return userService.verifyUser(user.getUserName(), user.getPassword());
	}

}
