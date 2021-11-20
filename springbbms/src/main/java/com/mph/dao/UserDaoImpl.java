package com.mph.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.User;


@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}


	@Override
	public List<User> getUserList() {
		Query qry = getSession().createQuery("from User");
		List<User> usrlist = qry.list();
		return usrlist;
	}


	@Override
	public User getUser(User user) {
		Criteria c = getSession().createCriteria(User.class);
		c.add(Restrictions.eq("email", user.getUsr_email()));
		User usr = (User)c.uniqueResult();
		
		return usr;
	}


	@Override
	public void createUser(User user) {
		getSession().saveOrUpdate(user);
		System.out.println("User Stored Successfully :)");
		
		
	}


	@Override
	public List<User> updateUser(User user) {
		Query qry = getSession().createQuery("update User set usr_name=:nam,usr_password=:pass where usr_id=:eno");
		qry.setParameter("nam", user.getUsr_name());
		qry.setParameter("pass", user.getUsr_password());
		qry.setParameter("eno", user.getUsr_id());
		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Update is successfull !!!");
		}
		return getUserList();
	}


	@Override
	public List<User> deleteUser(int usr_id) {
		Query qry = getSession().createQuery("delete User where usr_id=:eno");		
		qry.setParameter("eno", usr_id);		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " +  usr_id + "successfully !!!");
		}
		return getUserList();
	}


	@Override
	public User getUserById(int usr_id) {
		Query query = getSession().createQuery("from User usr where usr_id=:eno");
		query.setParameter("eno", usr_id);
		User usrlist = (User)query.uniqueResult();
		System.out.println(usrlist);
		return usrlist; 
	}


	@Override
	public List<User> searchUserById(int usr_id) {
		Query query = getSession().createQuery("from User usr where usr_id=:eno");
		query.setParameter("eno", usr_id);
		List<User> usrlist =query.list();
		System.out.println(usrlist);
		return usrlist; 
	}


	/*@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<User> updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> deleteUser(int usr_id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User getUserById(int usr_id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> searchUserById(int usr_id) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
}
