package com.libraryManagement.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.libraryManagement.model.Customer;
import com.libraryManagement.service.CustomerService;


@RestController
@RequestMapping("CustomerName")

public class CustomerController {
	@Autowired
	CustomerService u ;
	@GetMapping("/CustomerNameendpt")
	public ArrayList<Customer> Customer(){
		
		ArrayList<Customer> list = u.Customer();
		return list;
	}
}


	