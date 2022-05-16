package com.springboot6772.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot6772.entity.Contact;
import com.springboot6772.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>
{
   public User findByuserEmailAndPassword(String userEmail,String password);
	
   public User getUserByUserName(String userName);
   
   
  

}




