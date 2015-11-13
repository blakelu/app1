package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.domain.ManagerUser;


//管理严
public class ManagerUserDAO extends HibernateDaoSupport{
	//保存图书
	public void save(ManagerUser managerUser) {
		super.getHibernateTemplate().save(managerUser);
	}
}
