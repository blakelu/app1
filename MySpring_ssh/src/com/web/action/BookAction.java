package com.web.action;

import com.domain.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.BookService;

//ͼ�����
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

	//ҵ�񷽷�---���
	public String add(){
		System.out.println("���ͼ��...");
		bookService.saveBook(book);
		return NONE;
	}

}
