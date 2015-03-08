package com.prateek.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.prateek.model.UserDetails;


@WebService
public interface BankAccountService {
	
	
	public UserDetails getUserDetails(@WebParam( name ="userName")final String username);
	
	public void addUserDetails(@WebParam(name="userDetails") final UserDetails userdetails);
	
	
	
	

}
