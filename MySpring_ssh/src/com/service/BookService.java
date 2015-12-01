package com.service;

import java.util.List;

import com.dao.BookDAO;
import com.domain.Book;

//ͼ�����ҵ���
public class BookService {
	
	private String imageFileName;
	
	//ע��DAO
	private BookDAO bookDAO;
	
	
	
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	
	public BookDAO getBookDAO() {
		return bookDAO;
	}


	//ҵ�����-���ͼ��
	public void saveBook(Book book){
		bookDAO.save(book);
	}
	
	public List<Book> findBooks() {
		return bookDAO.findall();
			
	}
	
}
