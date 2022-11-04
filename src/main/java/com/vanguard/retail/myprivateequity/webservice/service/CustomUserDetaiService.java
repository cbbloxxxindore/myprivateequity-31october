package com.vanguard.retail.myprivateequity.webservice.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vanguard.retail.myprivateequity.webservice.dao.UserRepository;
import com.vanguard.retail.myprivateequity.webservice.models.User;

@Service
public class CustomUserDetaiService implements UserDetailsService{

	
	 @Autowired
	    private UserRepository repository;

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        User user = repository.findByUserName(username);
	        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), new ArrayList<>());
	    }
}
