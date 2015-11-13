package com.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.domain.Book;

//图书操作
public class BookDAO extends HibernateDaoSupport{
	//保存图书
	public void save(Book book ) {
		super.getHibernateTemplate().save(book);
	}
	
	public void update(Book book) {
		super.getHibernateTemplate().update(book);
	}
	
	public void delet(Book book) {
		super.getHibernateTemplate().delete(book);
	}
	
	public List<Book> findall(){
		return super.getHibernateTemplate().loadAll(Book.class);
	}
	
	public Book findById(int id){
		return super.getHibernateTemplate().get(Book.class, id);
	}
	
	//任意条件查询
	public List<Book> findByNamedQuery(String queryName, Object... args){
		return super.getHibernateTemplate().findByNamedQuery(queryName,	args);
	}
	
	public List<Book> findByDetachedCriteria(DetachedCriteria detachedCriteria) {
		return super.getHibernateTemplate().findByCriteria(detachedCriteria);		
	}
}
