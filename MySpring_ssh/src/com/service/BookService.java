package com.service;

import com.dao.BookDAO;
import com.domain.Book;

//ͼ�����ҵ���
public class BookService {
	//ע��DAO
	private BookDAO bookDAO;
	
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	//ҵ�����-���ͼ��
	public void saveBook(Book book){
		bookDAO.save(book);
	}
}
