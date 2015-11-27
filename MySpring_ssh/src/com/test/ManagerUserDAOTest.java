package com.test;

import static org.junit.Assert.*;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.ManagerUserDAO;
import com.domain.Book;
import com.domain.ManagerUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ManagerUserDAOTest {
	@Autowired
	private ManagerUserDAO managerUserDao;
	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByNamedQuery() {
		System.out.println(managerUserDao.findByNamedQuery("ManagerUser.verify", "lala","123"));
	}
	
	@Test
	public void testFindByDetachedCriteria() {
		DetachedCriteria criteria = DetachedCriteria.forClass(ManagerUser.class);
		SimpleExpression se1 = Restrictions.eq("username", "lala");
		SimpleExpression se2 = Restrictions.eq("password", "123");
//		criteria.add(Restrictions.eq("username", "lala"));
//		criteria.add(Restrictions.eq("password", "123"));
		criteria.add(Restrictions.and(se1, se2));
		System.out.println(managerUserDao.findByDetachedCriteria(criteria));
	}

}
