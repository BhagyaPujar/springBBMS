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

import com.mph.entity.User;
import com.mph.service.UserService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@RestController
@RequestMapping(value = "/user")
@CrossOrigin(origins = {"http://localhost:4200","https://editor.swagger.io/"},
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},
allowCredentials = "false",allowedHeaders = "*")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/allusr")
	public ResponseEntity<List<User>> allUser()
	{
		List<User> elist=userService.getUserList();
		System.out.println(elist);
		if(elist.isEmpty())
		{
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(elist,HttpStatus.OK);
		
	}
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user)
	{
	userService.createUser(user);
	return user;

	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int usr_id)
	{
		User usr= userService.getUserById(usr_id);
		if(usr == null)
		{
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<User>(usr,HttpStatus.OK);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<List<User>> updateUser(@RequestBody User user)
	{
		System.out.println("Update Rest () " + user);
		List<User> uelist=userService.updateUser(user);
		System.out.println(uelist);
		if(uelist.isEmpty())
		{
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(uelist,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<List<User>> deleteUser(@PathVariable("id") int usr_id)
	{
		List<User> delist=userService.deleteUser(usr_id);
		System.out.println(delist);
		if(delist.isEmpty())
		{
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(delist,HttpStatus.OK);
	}
}
