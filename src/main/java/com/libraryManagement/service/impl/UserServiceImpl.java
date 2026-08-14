package com.libraryManagement.service.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagement.Entity.User;
import com.libraryManagement.repository.UserRepository;
import com.libraryManagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository; 
	
	public List<User> getAllUser() {        
		List<User> users = userRepository.findAll();
		
		return users;
		
		
	}

}
