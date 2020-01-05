package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.bean.Book;
import com.bw.mapper.BooksMapper;

@Service
public class BooksServiceImpl implements BooksService {

	@Resource
	private BooksMapper bmapper;

	public int add(Book b) {
		int i = bmapper.add(b);
		return i;
	}

	public List<Book> selAll(Map<String, Object> map) {
		List<Book> list = bmapper.selAll(map);
		return list;
	}

	public List<Map<String, Object>> selT() {
		List<Map<String, Object>> t = bmapper.selT();
		return t;
	}

}
