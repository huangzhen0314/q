package com.bw.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bw.bean.Book;

public interface BooksMapper {
	public int add(Book b);

	public int adde(@Param("bid") int bid, @Param("erroc") int erroc);

	public List<Book> selAll(Map<String, Object> map);

	public List<Map<String, Object>> selT();
}
