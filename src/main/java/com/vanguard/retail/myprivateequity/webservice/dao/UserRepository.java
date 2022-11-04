package com.vanguard.retail.myprivateequity.webservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vanguard.retail.myprivateequity.webservice.models.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

	User findByUserName(String username);

	
}
