package com.mph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Patient;

import com.mph.service.PatientService;


@RestController
@RequestMapping(value = "/patient")
@CrossOrigin(origins = "http://localhost:4200",
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},
allowCredentials = "false",allowedHeaders = "*")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@GetMapping("/getPatient/{id}")
	public ResponseEntity<Patient> getPatientById(@PathVariable("id") int pat_id)
	{
		Patient pat= patientService.getPatientById(pat_id);
		if(pat == null)
		{
			return new ResponseEntity<Patient>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Patient>(pat,HttpStatus.OK);
	}
	

}
