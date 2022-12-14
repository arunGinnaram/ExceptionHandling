package com.arun.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/global")
public class ExceptionHandlingCon2 { 
	
	@GetMapping("/")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("date",new Date());
		String name = null;
		name.length();
		mav.setViewName("/date");
		return mav;
	} 
	 
}
