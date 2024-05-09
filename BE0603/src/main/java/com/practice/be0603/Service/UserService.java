package com.practice.be0603.Service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.practice.be0603.Repository.UserRepo;
import com.practice.be0603.Repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	public UserRepository userRepository;
	
	
	public Boolean authenticate(String email,String password)
	{
		User u = (User) userRepository.findByEmail(email);
		if(u!=null && u.getPassword().equals(password))
			return true;
		return false;
		
	}

}
