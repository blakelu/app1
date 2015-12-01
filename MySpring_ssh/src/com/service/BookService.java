package com.service;

import java.util.List;

import com.dao.BookDAO;
import com.domain.Book;

//图书操作业务层
public class BookService {
	
	private String imageFileName;
	
	//注入DAO
	private BookDAO bookDAO;
	
	
	
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	
	public BookDAO getBookDAO() {
		return bookDAO;
	}


	//业务操作-添加图书
	public void saveBook(Book book){
		bookDAO.save(book);
	}
	
	public List<Book> findBooks() {
		return bookDAO.findall();
			
	}
	
}
