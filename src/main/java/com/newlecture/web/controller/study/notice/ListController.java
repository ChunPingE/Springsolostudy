package com.newlecture.web.controller.study.notice;

import java.util.*;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.*;

import com.newlecture.web.entity.*;
import com.newlecture.web.service.*;

public class ListController implements Controller {

	@Autowired
	private NoticeService noticeSerivce;

	public void setNoticeService(NoticeService noticeSerivce) {
		this.noticeSerivce = noticeSerivce;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("notice.list");
		List<Notice> list = noticeSerivce.getList(1, "TITLE", "");
		mv.addObject("list", list);
		return mv;
	}
}
