package com.mph.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Hospital;

@Repository
public class HospitalDaoImpl implements HospitalDao{

	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Hospital> searchHospitalById(int hospid) {
		Query query = getSession().createQuery("from Hospital hosp where hospid=:hospno");
		query.setParameter("hospno", hospid);
		List<Hospital> hosplist =query.list();
		System.out.println(hosplist);
		return hosplist; 
	}


}