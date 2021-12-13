package com.onlinelibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinelibrary.entities.User;
import com.onlinelibrary.repos.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}
	
	public User getUserByEmail(String email) {
		return userRepository.findByEmail(email);	
	}
	
	public User getUserByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);	
	}


}
