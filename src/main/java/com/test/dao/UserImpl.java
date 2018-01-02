package com.test.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.entity.User;
import com.test.service.MemcachedService;

import net.spy.memcached.MemcachedClient;

@Repository
@Transactional
public class UserImpl implements UserDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private MemcachedService mcMemcachedService;
	@Autowired
	private MemcachedClient memcachedClient;
	
	public List<User> findAll(Integer temp) {
		List<User> list;
		try {
			Date sDate=new Date();
			
			list = (List<User>) mcMemcachedService.getParams("2");
			
			Date eDate=new Date();
			System.out.println(eDate.getTime()-sDate.getTime());
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			
		}
		return list;
	}
	
	public List<User> findAlls(Integer temp) {
		Session session=sessionFactory.openSession();
		List<User> list;
		try {
			Query query = session.createQuery("from User");
			query.setFirstResult(0);
			query.setMaxResults(temp);
			Date sDate=new Date();
			
			list = query.list();
			
			Object o = mcMemcachedService.putParams("2", list);
			Object o1 = mcMemcachedService.getParams("2");
			
			/*System.out.println(memcachedClient.add("1", 1000*60, "asd"));
			System.out.println(memcachedClient.get("1"));*/
			
			Date eDate=new Date();
			System.out.println(eDate.getTime()-sDate.getTime());
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
		return list;
	}
}
