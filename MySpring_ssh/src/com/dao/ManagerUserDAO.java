package com.dao;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.domain.Book;
import com.domain.ManagerUser;


//管理严
public class ManagerUserDAO extends HibernateDaoSupport{
	
	//保存管理员
	public void save(ManagerUser managerUser) {
		super.getHibernateTemplate().save(managerUser);
	}
	
	//任意条件查询
	public List<ManagerUser> findByNamedQuery(String queryName, Object... args){
		List<ManagerUser> managerUsers = null;
		managerUsers = super.getHibernateTemplate().findByNamedQuery(queryName,	args);
		return managerUsers;
	}
	
	public List<ManagerUser> findByDetachedCriteria(DetachedCriteria detachedCriteria) {
		return super.getHibernateTemplate().findByCriteria(detachedCriteria);		
	}
}
