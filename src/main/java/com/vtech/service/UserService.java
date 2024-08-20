package com.vtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtech.models.User;
import com.vtech.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User validateUser(User user) {

		userRepository.save(user);
		return user;
	}

	public String verifyUser(String userName, String password) {

		if (userName.equals(password))
			return "success";
		else
			return "failure";
	}

}
