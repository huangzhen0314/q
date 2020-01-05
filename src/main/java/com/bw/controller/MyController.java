package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.bean.Book;
import com.bw.service.BooksService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MyController {

	@Resource
	private BooksService bservice;

	@RequestMapping("list")
	public String selAll(Model model, @RequestParam(defaultValue = "1") int pageNum) {
		int pageSize = 2;
		PageHelper.startPage(pageNum, pageSize);
		Map<String, Object> map = new HashMap<String, Object>();
		List<Book> list = bservice.selAll(map);
		PageInfo<Book> plist = new PageInfo<Book>(list);
		model.addAttribute("plist", plist);
		return "list";
	}
}
