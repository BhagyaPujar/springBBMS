package com.mph.dao;

import java.util.List;

import com.mph.entity.Hospital;

public interface HospitalDao {
	
	public List<Hospital> searchHospitalById(int hospid);
	

}