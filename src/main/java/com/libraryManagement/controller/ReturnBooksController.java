package com.libraryManagement.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libraryManagement.model.Return;
import com.libraryManagement.service.ReturnBooks;


@RestController
@RequestMapping("returnBooksList")




public class ReturnBooksController {
	@Autowired
	ReturnBooks r ;
	@GetMapping("/returnBooksList")
	public ArrayList<Return> ReturnBooksList(){
		
		
		ArrayList<Return> q = r.ReturnBooksList();
		return q;
	}
	

	
}

		

