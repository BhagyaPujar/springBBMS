package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.UserDao;
import com.mph.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public User getUser(User user) {
		return userDao.getUser(user);
	}

	@Override
	public void createUser(User user) {
		userDao.createUser(user);
		
	}

	@Override
	public List<User> updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public List<User> deleteUser(int usr_id) {
		return userDao.deleteUser(usr_id);
	}

	@Override
	public User getUserById(int usr_id) {
		return userDao.getUserById(usr_id);
	}

	@Override
	public List<User> searchUserById(int usr_id) {
		return userDao.searchUserById(usr_id);
	}

	/*@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> deleteUser(int usr_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int usr_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchUserById(int usr_id) {
		// TODO Auto-generated method stub
		return null;
	}*/

	
}
