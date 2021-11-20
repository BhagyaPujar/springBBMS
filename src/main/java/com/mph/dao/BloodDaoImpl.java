package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Blood;



@Repository
public class BloodDaoImpl implements BloodDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}


	@Override
	public List<Blood> searchBloodById(int bld_id) {
		Query query = getSession().createQuery("from Blood bld where bld_id=:bldno");
		query.setParameter("bldno", bld_id);
		List<Blood> bldlist =query.list();
		System.out.println(bldlist);
		return bldlist; 
	}

}