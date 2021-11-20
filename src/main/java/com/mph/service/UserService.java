package com.mph.service;

import java.util.List;

import com.mph.entity.User;

public interface UserService {
	public List<User> getUserList();
	public User getUser(User user);
	public void createUser(User user);
	public List<User>updateUser(User user);
	public List<User>deleteUser(int usr_id);
	
	public User getUserById(int usr_id);
	public List<User> searchUserById(int usr_id);
}
