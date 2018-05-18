package com.hisen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hisen.entity.Book;

public interface BookDao {
	
	Book queryById(long bookId);
	List<Book> queryAll(@Param("offset") int offset,@Param("limit") int limit);
	int addBook(Book book);
	int updateBook(Book book);
	int deleteBookById(long id);
	
}
