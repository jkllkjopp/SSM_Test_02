package com.hisen.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hisen.entity.Book;
import com.hisen.service.BookService;

public class BookServiceImplTest extends BookDaoTest {
	
	@Autowired
	private BookService bookService;
	
	@Test
	public void getById() {
		Book book = bookService.getById(1);
		System.out.println(book);
	}
	
}
