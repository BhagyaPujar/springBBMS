package com.mph.dao;

import java.util.List;

import com.mph.entity.Blood;



public interface BloodDao {
	
	public List<Blood> searchBloodById(int bld_id);

}