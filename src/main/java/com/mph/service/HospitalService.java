package com.mph.service;

import java.util.List;

import com.mph.entity.Hospital;

public interface HospitalService {

	List<Hospital> searchHospitalById(int hospno);


}