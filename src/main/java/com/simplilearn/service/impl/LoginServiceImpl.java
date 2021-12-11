package com.simplilearn.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.LoginUser;
import com.simplilearn.repository.LoginRepository;
import com.simplilearn.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService, UserDetailsService{

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public boolean changePassword(String username, String newPassword) {
		LoginUser user = loginRepository.findByUsername(username);
		if (Objects.nonNull(user)) {
			loginRepository.changePassword(newPassword, user.getUsername());
			System.out.println("user " + user.getUsername() + " has successfuly changed the password");
			return true;
		} else {
			System.out.println("Unable to change the password!");
			return false;
		}

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LoginUser user = loginRepository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new UserPrincipal(user);
	}
}
