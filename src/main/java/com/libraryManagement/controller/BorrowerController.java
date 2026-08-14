package com.libraryManagement.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libraryManagement.model.BookBorrowerCustomer;
import com.libraryManagement.service.BorrowerService;


@RestController
@RequestMapping("borrower")

public class BorrowerController {
	@Autowired
	BorrowerService bow ;
	@GetMapping("/borrowerendpt")
	
	public ArrayList<BookBorrowerCustomer > borrower(){
		
		ArrayList<BookBorrowerCustomer> borrowerList = bow.getborrower();
		return borrowerList;
		
	}

}
