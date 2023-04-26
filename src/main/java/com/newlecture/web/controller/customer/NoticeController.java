package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(@RequestParam(value = "p", required = false) Integer page, Model model) throws ClassNotFoundException, SQLException {
		
		System.out.println(page);
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		model.addAttribute("list", list);
		return "notice.list";
	}
	
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
	

	/*
	@RequestMapping("list")
	public String list(String p) throws ClassNotFoundException, SQLException {
		System.out.println(p);
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		return "notice.list";
	}
	
	@RequestMapping("list")
	public String list(HttpServletRequest request) throws ClassNotFoundException, SQLException {
		String p = request.getParameter("p");
		System.out.println(p);
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		return "notice.list";
	}
	
	
 	@RequestMapping("list")
	public String list() throws ClassNotFoundException, SQLException {
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		return "notice.list";
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("root.index");
		//mv.addObject("data", "Hello Spring MVC~");
		//mv.setViewName("/WEB-INF/view/index.jsp");
		//mv.setViewName("index");
		return mv;
	}
	*/
}
