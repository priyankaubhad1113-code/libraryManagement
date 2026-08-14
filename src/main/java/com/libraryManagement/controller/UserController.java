package com.libraryManagement.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libraryManagement.Entity.User;
import com.libraryManagement.service.UserService;




@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService; 
	
	@GetMapping("/get-all-user")
	public List<User> getAllUserList(){
		List<User> users = userService.getAllUser();
		return users;
		
	}
	
	
	

}
