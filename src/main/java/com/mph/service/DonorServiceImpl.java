package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.DonorDao;
import com.mph.entity.Donor;



@Service
@Transactional
public class DonorServiceImpl implements DonorService {
	@Autowired
	DonorDao donorDao;

	@Override
	public void addDonor(Donor donor) {
		donorDao.addDonor(donor);}

	@Override
	public List<Donor> getDonorList() {
		
		return donorDao.getDonorList();
	}
	
	
}