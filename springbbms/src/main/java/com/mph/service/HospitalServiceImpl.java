package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.HospitalDao;
import com.mph.entity.Hospital;


@Service
@Transactional
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	HospitalDao hospitalDao;
	
	
	@Override
	public List<Hospital> searchHospitalById(int hosp_id) {
		return hospitalDao.searchHospitalById(hosp_id);
	}
	

}