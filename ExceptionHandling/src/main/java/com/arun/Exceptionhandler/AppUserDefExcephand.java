package com.arun.Exceptionhandler;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppUserDefExcephand {

	@GetMapping("/custom")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("date",new Date());
		String name = null;
		name.length();
		mav.setViewName("/custom");
		return mav;
	} 
	 
}
