package com.mph.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Patient;



@Repository
public class PatientDaoImpl implements PatientDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	

	@Override
	public Patient getPatientById(int pat_id) {
		Query query = getSession().createQuery("from Patient pat where pat_id=:eno");
		query.setParameter("eno", pat_id);
		Patient patlist = (Patient)query.uniqueResult();
		System.out.println(patlist);
		return patlist; 
		
	}
	

}
