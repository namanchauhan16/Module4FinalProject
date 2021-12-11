package com.simplilearn.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.LoginUser;
import com.simplilearn.service.LoginService;

@RestController
@RequestMapping("/public")
public class LoginController {

	@Autowired
	LoginService loginService;

	@GetMapping("/login")
	public String loginUser() {
			return "Welcome to the application!";
	}

	@PutMapping("/changePassword")
	public String changePassword(@RequestParam("username") String username,
			@RequestParam("newPassword") String newPassword) {
		boolean passwordChanged = loginService.changePassword(username, newPassword);
		if (Objects.nonNull(passwordChanged)) {
			return "Password changed Successfully";
		} else {
			return "Something went wrong, Credentials mismatch!";
		}
	}
}