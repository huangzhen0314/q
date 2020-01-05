package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.Book;

public interface BooksService {
	public int add(Book b);

	public List<Book> selAll(Map<String, Object> map);
	
	public List<Map<String, Object>> selT();
}
