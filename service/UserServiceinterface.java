package com.userapiexample.service;

import java.util.List;

import com.userapiexample.entity.User;

public interface UserServiceinterface {
    
    User createUser(User user);
    
    User getUserById(int id);
    
    List<User> getAllUsers();
    
    User updateUser(int id, User userDetails);
    
    void deleteUser(int id);
}
