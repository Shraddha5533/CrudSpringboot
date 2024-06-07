package com.userapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userapiexample.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
	
	
	

}
