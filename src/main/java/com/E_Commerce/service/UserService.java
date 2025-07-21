package com.E_Commerce.service;

import java.util.List;

import com.E_Commerce.exception.UserException;
import com.E_Commerce.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
