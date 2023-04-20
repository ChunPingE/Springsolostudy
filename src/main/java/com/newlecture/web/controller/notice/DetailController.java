package com.newlecture.web.controller.notice;

import javax.servlet.http.*;

import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.*;

public class DetailController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("notice.detail");
		mv.addObject("data", "Hello Spring MVC~");
		return mv;
	}
}
