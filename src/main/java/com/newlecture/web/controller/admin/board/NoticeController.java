package com.newlecture.web.controller.admin.board;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.newlecture.web.entity.*;
import com.newlecture.web.service.*;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	@RequestMapping("list")
	public String list() {
		return "list";
	}

	@RequestMapping("reg")
	@ResponseBody
	public String reg(String title, String content, String category, String[] foods) {
		for (String food : foods) {
			System.out.println(food);
		}
		return String.format("title:%s<br>contentL%s<br>categroy:%s", title, content, category);
	}
}
