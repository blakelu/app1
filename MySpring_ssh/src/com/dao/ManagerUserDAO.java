package com.dao;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.domain.Book;
import com.domain.ManagerUser;


//������
public class ManagerUserDAO extends HibernateDaoSupport{
	
	//�������Ա
	public void save(ManagerUser managerUser) {
		super.getHibernateTemplate().save(managerUser);
	}
	
	//����������ѯ
	public List<ManagerUser> findByNamedQuery(String queryName, Object... args){
		List<ManagerUser> managerUsers = null;
		managerUsers = super.getHibernateTemplate().findByNamedQuery(queryName,	args);
		return managerUsers;
	}
	
	public List<ManagerUser> findByDetachedCriteria(DetachedCriteria detachedCriteria) {
		return super.getHibernateTemplate().findByCriteria(detachedCriteria);		
	}
}
