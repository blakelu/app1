package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.domain.ManagerUser;


//������
public class ManagerUserDAO extends HibernateDaoSupport{
	//����ͼ��
	public void save(ManagerUser managerUser) {
		super.getHibernateTemplate().save(managerUser);
	}
}
