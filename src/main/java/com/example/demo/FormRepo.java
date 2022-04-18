package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public interface FormRepo extends JpaRepository<Form, Long>{
	
	 @Query("SELECT " +
	           "    new com.example.demo.UserDto(u.id,u.email,u.password,u.firstname,u.lastname) " +
	           "FROM " +
	           "User u, Form f " +
	           "where u.id = f.id AND  f.date= ?1")
	public List<UserDto> findAll(String date);
}
	