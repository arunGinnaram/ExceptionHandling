package com.arun.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.arun.Exceptionhandler.NoBookFoundException;

@ControllerAdvice
 public class customExHan { 
	@ExceptionHandler(value=NoBookFoundException.class)
	public ModelAndView handleNullPointerExp() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("Message","No Book Found with this id");
		mav.setViewName("/customError");
		return mav;
	}
}
