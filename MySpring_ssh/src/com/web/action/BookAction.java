package com.web.action;

import com.domain.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.BookService;

//图书管理
public class BookAction extends ActionSupport implements ModelDriven<Book>{
	private Book book = new Book();

	@Override
	public Book getModel() {
		return book;
	}
	
	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	//业务方法---添加
	public String add(){
		System.out.println("添加图书...");
		bookService.saveBook(book);
		return NONE;
	}

}
