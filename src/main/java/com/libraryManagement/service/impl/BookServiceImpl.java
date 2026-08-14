package com.libraryManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagement.Entity.Books;
import com.libraryManagement.repository.BookRepository;
import com.libraryManagement.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public List<Books> getBookDetails() {
		List<Books> b = bookRepository.findAll();
		return b ;
		
		
		
	}

}
