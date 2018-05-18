package com.hisen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hisen.dao.BookDao;
import com.hisen.entity.Book;
import com.hisen.service.BookService;

@Service
public class BookSerivceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;
	
	@Override
	public Book getById(long bookId) {
		// TODO Auto-generated method stub
		return bookDao.queryById(bookId);
	}

	@Override
	public List<Book> getList(int start, int pageNum) {
		// TODO Auto-generated method stub
		return bookDao.queryAll(start, pageNum);
	}

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBook(book);
	}

	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(book);
	}

	@Override
	public int deleteBookById(long bookId) {
		// TODO Auto-generated method stub
		return bookDao.deleteBookById(bookId);
	}

}
