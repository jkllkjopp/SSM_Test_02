package com.hisen.service;

import java.util.List;

import com.hisen.entity.Book;

public interface BookService {
	
	Book getById(long bookId);
	List<Book> getList(int start,int pageNum);
	int addBook(Book book);
	int updateBook(Book book);
	int deleteBookById(long bookId);
	
}
