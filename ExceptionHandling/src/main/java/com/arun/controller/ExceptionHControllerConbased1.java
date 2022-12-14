package com.arun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.arun.service.Ibook;

@RestController
@RequestMapping("/customH")
public class ExceptionHControllerConbased1 { 
	
	@Autowired
	private Ibook ib;	
	
	@GetMapping("/{id}")
	public ModelAndView index(@PathVariable int id){
		ModelAndView mav = new ModelAndView();
		String bookPriceById = ib.bookPriceById(id);
		mav.addObject("bookPriceById",bookPriceById);		
		mav.setViewName("/custom");
		return mav;
	} 
	
}
