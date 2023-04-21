package com.newlecture.web.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("index")
	public String index() {
		return "root.index";
	}
	
	/*
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("root.index");
		mv.addObject("data", "Hello Spring MVC~");
		//mv.setViewName("index");
		return mv;
	}
	*/
}