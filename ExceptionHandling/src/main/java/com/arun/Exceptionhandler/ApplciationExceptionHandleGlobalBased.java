package com.arun.Exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice 
//to make this as controller based exception handling - remove this @ControllerAdvice 
public class ApplciationExceptionHandleGlobalBased {

	@ExceptionHandler(value=NullPointerException.class)
	public ModelAndView handleNullPointerExp() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("Message","Date Couldn't display-Error Occurred");
		mav.setViewName("/errorGlobal");
		return mav;
	}
	
}
