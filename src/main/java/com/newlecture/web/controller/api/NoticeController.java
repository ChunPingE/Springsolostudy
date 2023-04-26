package com.newlecture.web.controller.api;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.newlecture.web.entity.*;
import com.newlecture.web.service.*;

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {

	@Autowired
	private NoticeService service;

	@RequestMapping("list")
	public List<Notice> list() throws ClassNotFoundException, SQLException {

		List<Notice> list = service.getList(1, "TITLE", "");

		return list;
	}
}