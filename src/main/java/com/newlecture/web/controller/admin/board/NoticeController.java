package com.newlecture.web.controller.admin.board;

import java.io.*;

import javax.servlet.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice")
public class NoticeController {

	@Autowired
	private ServletContext ctx;

	@GetMapping("list")
	public String list() {
		return "admin.board.notice.list";
	}
	
	@GetMapping("detail")
	public String detail() {
		return "admin.board.notice.detail";
	}

	@GetMapping("reg")
	public String reg() {
		return "admin.board.notice.reg";
			
	}
	
	@PostMapping("reg")
	public String reg(String title, String content, MultipartFile[] files, String category, String[] foods)
			throws IllegalStateException, IOException {
		for(MultipartFile file : files) {
		if(file.getSize() == 0) {
			continue;
		}
		
		String fileName = file.getOriginalFilename();
		long size = file.getSize();
		System.out.printf("fileName:%s. fileSixe:%d\n", fileName, size);

		String webPath = "/static/upload";
		String realPath = ctx.getRealPath("/upload");
		
		//업로드하기 위한경로가 없을경우 확인하고 생성
		File savepath = new File(realPath);
		if (!savepath.exists()) {
			savepath.mkdirs();
		}
		realPath += File.separator + fileName;
		
		File saveFile = new File(realPath);
		file.transferTo(saveFile);
		}
		for (String food : foods) {
			System.out.println(food);
		}
		return "rediect:list";
		//return String.format("title:%s<br>contentL%s<br>categroy:%s", title, content, category);
	}
}
