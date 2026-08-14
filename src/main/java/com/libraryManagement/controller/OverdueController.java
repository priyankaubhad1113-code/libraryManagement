package com.libraryManagement.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libraryManagement.model.Overdue;
import com.libraryManagement.service.impl.OverdueServiceImpl;

@RestController
@RequestMapping("overdue")

public class OverdueController {
	@Autowired
	OverdueServiceImpl d ;
	
	@GetMapping("/overdueendpt")
	public ArrayList<Overdue> overdueDateNames(){
		
		ArrayList<Overdue> s = d.overdueDateNames();
		return s ;
	}

}
