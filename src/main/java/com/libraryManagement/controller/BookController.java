package com.libraryManagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libraryManagement.Entity.Books;
import com.libraryManagement.service.BookService;


@RestController
@RequestMapping("books")

public class BookController {
	@Autowired
	BookService bookService ;
	
	@GetMapping("/get-all-BookDetails")
	public List<Books> getBookDetailsBooks(){
		List<Books> details = bookService.getBookDetails();
		return details;
		
	}
	
}
