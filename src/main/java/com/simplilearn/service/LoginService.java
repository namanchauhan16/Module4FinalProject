package com.simplilearn.service;

import com.simplilearn.entity.LoginUser;

public interface LoginService {

	boolean changePassword(String username, String newPassword);
}
