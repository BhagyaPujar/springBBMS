package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Donor;
import com.mph.entity.User;



@Repository
public class DonorDaoImpl implements DonorDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
		@Override
	public void addDonor(Donor donor) {
		getSession().saveOrUpdate(donor);
		System.out.println("Donor Stored Successfully :)");
		
		
	}

		@Override
		public List<Donor> getDonorList() {
			Query qry = getSession().createQuery("from Donor");
			List<Donor> dnrlist = qry.list();
			return dnrlist;
			
		}
}