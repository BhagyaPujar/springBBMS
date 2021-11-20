package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.BloodDao;
import com.mph.entity.Blood;



@Service
@Transactional
public class BloodServiceImpl implements BloodService {
	
	@Autowired
	BloodDao bloodDao;
	
	
	@Override
	public List<Blood> searchBloodById(int bld_id) {
		return bloodDao.searchBloodById(bld_id);
	}
	

}