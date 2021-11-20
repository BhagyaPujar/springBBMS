package com.mph.service;

import java.util.List;

import com.mph.entity.Donor;

public interface DonorService {
	public void addDonor(Donor donor);

	public List<Donor> getDonorList();
	
}