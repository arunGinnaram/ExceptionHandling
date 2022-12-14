package com.arun.service;

import org.springframework.stereotype.Service;

import com.arun.Exceptionhandler.NoBookFoundException;

@Service
public class bookImp implements Ibook {

	@Override
	public String bookPriceById(int id) {
		 
		if(id==101) {
			return "Book price: $15.00";
		}
		else {
			throw new NoBookFoundException("No book found with this Id");
		}
		
	} 

}
