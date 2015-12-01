package com.test;

import static org.junit.Assert.*;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.BookDAO;
import com.domain.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookDAOTest {
	@Autowired
	private BookDAO bookDAO;
	
	@Test
	public void testSave() {
		Book book = new Book();
		book.setName("java核心技术2");
		book.setPrice(100d);
		
		bookDAO.save(book);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelet() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindall() {
		System.out.println(bookDAO.findall());
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByNamedQuery() {
		System.out.println(bookDAO.findByNamedQuery("Book.findByName", "%我去%"));
	}

	@Test
	public void testFindByDetachedCriteria() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Book.class);
		criteria.add(Restrictions.like("name", "%复刻版%"));
		System.out.println(bookDAO.findByDetachedCriteria(criteria));
	}

}
