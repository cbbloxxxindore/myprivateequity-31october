package com.vanguard.retail.myprivateequity.webservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanguard.retail.myprivateequity.webservice.jwtutil.JwtUtil;
import com.vanguard.retail.myprivateequity.webservice.models.AuthRequest;

@RestController
public class WelcomeResource {

	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {

		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
					);

		}
		catch (Exception exception)
		{

			throw new Exception("invalid userame/password");
		}
		return jwtUtil.generateToken(authRequest.getUsername());
	}

}
