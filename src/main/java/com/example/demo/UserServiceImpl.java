package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{ 

	@Autowired
	private UserRepo userrepository;
	
	@Autowired
	private FormRepo formrepo;
	
	@Override
	public User saveUser(User user) {
		User exists = userrepository.emailExists(user.getEmail());
		if(exists != null) {
			return new User();
		}
		return userrepository.save(user);
	}

	@Override
	public User getUser(User user) {
		User userInfo = userrepository.validateCredentials(user.getEmail(),user.getPassword());
		if (userInfo == null) {
			return new User();
		}
		return userInfo;	
	}

	@Override
	public Form saveForm(Form form) {
		return formrepo.save(form);
	}

	@Override
	public List<UserDto> findAllUsers(String date) {
		List<UserDto> usersInfo = formrepo.findAll(date);
		return usersInfo;
	}
}
