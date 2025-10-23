package com.erp.HirePilot.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.erp.HirePilot.entity.User;



@Repository
public interface UserRepo extends JpaRepository <User, String> {

	Optional<User> findByUsername(String username);
	            

	User findByEmail(String email);


	boolean existsByUsername(String username);


	Optional<User> findById(Long fallbackUserId);
/*
	  // ID type is Integer
	    Optional<User> findByUsername(String username);
	    User findByEmail(String email);
	    boolean existsByUsername(String username);
	

*/
	

	
	
}
