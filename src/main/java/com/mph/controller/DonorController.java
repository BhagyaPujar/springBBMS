package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Donor;
import com.mph.service.DonorService;



@RestController
@RequestMapping(value = "/donor")
@CrossOrigin(origins = "http://localhost:4200",
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},
allowCredentials = "false",allowedHeaders = "*")
public class DonorController {

	@Autowired
	DonorService donorService;
	
	@GetMapping("/alldnr")
	public ResponseEntity<List<Donor>> allDonor()
	{
		List<Donor> elist=donorService.getDonorList();
		System.out.println(elist);
		if(elist.isEmpty())
		{
			return new ResponseEntity<List<Donor>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Donor>>(elist,HttpStatus.OK);
		
	}
	
	@PostMapping("/addDonor")
	public Donor addDonor(@RequestBody Donor donor)
	{
	donorService.addDonor(donor);
	return donor;

	}
	
	
}

