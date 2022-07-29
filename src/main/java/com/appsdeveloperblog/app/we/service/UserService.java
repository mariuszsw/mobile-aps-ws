package com.appsdeveloperblog.app.we.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appsdeveloperblog.app.we.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);

}
