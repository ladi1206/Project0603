package com.practice.be0603.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.be0603.Entity.User;
import com.practice.be0603.Service.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService userService;
	
	public String login(@RequestBody User u)
	{
		if(userService.authenticate(u.getEmail(), u.getPassword()))
			return "Login Successful";
		return "Login Failure";
	}
	
}
