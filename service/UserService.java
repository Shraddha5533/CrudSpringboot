package com.userapiexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userapiexample.entity.User;
import com.userapiexample.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user)
	{
		return userRepository.save(user);
		
	}
	
	public User getUserById(int id)
	{
		return userRepository.findById(id).orElse(null);
		
	}
	
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
	
	public User updateUser (int id , User userDetails)
	{
		User user= userRepository .findById(id).orElse(null);
		
		if(user!= null)
		{
			user.setName(userDetails.getName());
			user.setEmail(userDetails.getEmail());
			return userRepository.save(user);
			
		}
		return null;
	}
	
	public void deleteUser(int id)
	{
		userRepository.deleteById(id);
	}

}
