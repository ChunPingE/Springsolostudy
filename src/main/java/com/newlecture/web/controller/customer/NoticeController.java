package com.newlecture.web.controller.customer;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.newlecture.web.entity.*;
import com.newlecture.web.service.*;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(Model model) throws Exception{
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		model.addAttribute("list", list);
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
}
