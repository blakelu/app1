package com.test;

import static org.junit.Assert.*;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.BookDAO;
import com.domain.Book;
import com.service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookServiceTest {
	@Autowired
	private BookService bookService;
	@Test
	public void testSetBookDAO() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveBook() {
		Book book = new Book();
		book.setName("…Ó»Î«≥≥ˆspring");
		book.setPrice(80d);
		
		bookService.saveBook(book);
	}

}
