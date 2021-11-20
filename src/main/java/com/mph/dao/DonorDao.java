package com.mph.dao;


import java.util.List;

import com.mph.entity.Donor;
import com.mph.entity.User;

public interface DonorDao {

	

	void addDonor(Donor donor);

	List<Donor> getDonorList();
}