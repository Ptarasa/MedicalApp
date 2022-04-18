package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Long>{
	
	@Query(value = "SELECT * FROM users  WHERE email = ?1 and password = ?2",
		       nativeQuery = true)
	User validateCredentials(String email, String password);

	@Query(value = "SELECT * FROM users  WHERE email = ?1",
		       nativeQuery = true)
	User emailExists(String email);

}
