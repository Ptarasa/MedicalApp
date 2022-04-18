package com.example.demo;

import java.util.List;

public interface UserService {
	
	User saveUser(User user);
	User getUser(User user);
	Form saveForm(Form form);
	List<UserDto> findAllUsers(String date);
	
}
