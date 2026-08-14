package com.libraryManagement.service.impl;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.libraryManagement.model.Overdue;
import com.libraryManagement.service.OverdueService;

@Service
public class OverdueServiceImpl  implements OverdueService{
	public ArrayList<Overdue> overdueDateNames(){
		ArrayList<Overdue> bList  = new ArrayList<>();
		
		Overdue a1 = new Overdue();
		a1.setCustomerId(001);
		a1.setCustomerName("suresh");
		a1.setBookName("Taare Jameen Par");
		a1.setDueDate("25/12/2026");
		
		Overdue a2 = new Overdue();
		a2.setCustomerId(002);
		a2.setCustomerName("mukesh");
		a2.setBookName("Sitaare Jameen Par");
		a2.setDueDate("25/11/2026");

		Overdue a3 = new Overdue();
		a3.setCustomerId(003);
		a3.setCustomerName("ramesh");
		a3.setBookName("encyclopidea");
		a3.setDueDate("22/10/2026");

		Overdue a4 = new Overdue();
		a4.setCustomerId(004);
		a4.setCustomerName("yogesh");
		a4.setBookName("Taare Jameen Par");
		a4.setDueDate("25/12/2026");

		Overdue a5 = new Overdue();
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
