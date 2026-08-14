package com.libraryManagement.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.libraryManagement.model.Customer;
import com.libraryManagement.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	public  ArrayList<Customer> Customer(){
		ArrayList<Customer> Clist = new ArrayList<>();
		
		Customer c1 = new Customer(); 
		c1.setCustId(1);
		c1.setCustName("ramesh");
		c1.setCustMob(8010909899L);
		c1.setBookIssue("Meditation");
		
		Customer c2 = new Customer(); 
		c2.setCustId(2);
		c2.setCustName("kavya");
		c2.setCustMob(8010909856L);
		c2.setBookIssue("power law");
		
		Customer c3 = new Customer(); 
		c3.setCustId(3);
		c3.setCustName("fenni");
		c3.setCustMob(8016609899L);
		c3.setBookIssue("laws");
		
		Customer c4 = new Customer(); 
		c4.setCustId(4);
		c4.setCustName("preet");
		c4.setCustMob(9010909899L);
		c4.setBookIssue("rich dad poor dad");
		
		Customer c5 = new Customer(); 
		c5.setCustId(5);
		c5.setCustName("mahesh");
		c5.setCustMob(4567909899L);
		c5.setBookIssue("atomic habbits ");
		
		
		
		Clist.add(c1);
		Clist.add(c2);
		Clist.add(c3);
		Clist.add(c4);
		Clist.add(c5);
		
		return Clist;
		
		
		}

	
}


