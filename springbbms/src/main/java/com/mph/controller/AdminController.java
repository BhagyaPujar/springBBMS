package com.mph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Admin;
import com.mph.service.AdminService;

@RestController
@RequestMapping("/adminControl")
public class AdminController {

	@Autowired
	AdminService adminService;
	@Autowired
	Admin admin;
	
	@GetMapping("/login/{emailid}/{password}")
	public ResponseEntity<?> checkAdmin(@PathVariable("emailid")String emailid,
			@PathVariable("password")String password){

		if(emailid.equals(admin.getEmailId()) && 
				password.equals(admin.getPassword()))
		{
			
				return new ResponseEntity("admin",HttpStatus.OK);
		}
		else {
			
			return new ResponseEntity("sry not admin",HttpStatus.BAD_REQUEST);
		}
		
	}

	
	
}
