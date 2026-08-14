package com.libraryManagement.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.libraryManagement.model.BookBorrowerCustomer;
import com.libraryManagement.service.BorrowerService;

@Service
public class BorrowerServiceImpl implements BorrowerService {
	
	public ArrayList<BookBorrowerCustomer> getborrower(){
		ArrayList<BookBorrowerCustomer> bList = new ArrayList<>() ;
		
		BookBorrowerCustomer a1 = new BookBorrowerCustomer();
		a1.setCustomerId(001);
		a1.setCustomerName("suresh");
		a1.setBookName("Taare Jameen Par");
		a1.setDueDate("25/12/2026");
		
		BookBorrowerCustomer a2 = new BookBorrowerCustomer();
		a2.setCustomerId(002);
		a2.setCustomerName("mukesh");
		a2.setBookName("Sitaare Jameen Par");
		a2.setDueDate("25/11/2026");

		BookBorrowerCustomer a3 = new BookBorrowerCustomer();
		a3.setCustomerId(003);
		a3.setCustomerName("ramesh");
		a3.setBookName("encyclopidea");
		a3.setDueDate("22/10/2026");

		BookBorrowerCustomer a4 = new BookBorrowerCustomer();
		a4.setCustomerId(004);
		a4.setCustomerName("yogesh");
		a4.setBookName("Taare Jameen Par");
		a4.setDueDate("25/12/2026");

		BookBorrowerCustomer a5 = new BookBorrowerCustomer();
		a5.setCustomerId(001);
		a5.setCustomerName("suresh");
		a5.setBookName("Taare Jameen Par");
		a5.setDueDate("25/12/2026");

		
		
		bList.add(a1);
		bList.add(a2);
		bList.add(a3);
		bList.add(a4);
		bList.add(a5);
		
		return bList;
	}

}
