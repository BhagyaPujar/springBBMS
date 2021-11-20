package com.mph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.PatientDao;

import com.mph.entity.Patient;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientDao patientDao;
	
	@Override
	public Patient getPatientById(int pat_id) {
		return patientDao.getPatientById(pat_id);
	}
	

}
