package com.newlecture.web.controller.notice;

import javax.servlet.http.*;

import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.*;

public class ListController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("notice/list");
		mv.addObject("data", "Hello Spring MVC~");
		return mv;
	}
}
