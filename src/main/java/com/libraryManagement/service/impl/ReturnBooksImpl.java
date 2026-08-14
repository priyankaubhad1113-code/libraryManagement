package com.libraryManagement.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.libraryManagement.model.Return;
import com.libraryManagement.service.ReturnBooks;


@Service
public class ReturnBooksImpl implements ReturnBooks {
	
	public ArrayList<Return> ReturnBooksList(){
		ArrayList<Return> RList = new ArrayList<>();
		
		Return r1 = new Return();
		r1.setReturnList("ikagai");
		
		
	
		
		RList.add(r1);
		return RList;
		

	}

}