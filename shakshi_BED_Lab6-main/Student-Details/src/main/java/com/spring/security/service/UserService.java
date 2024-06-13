package com.spring.security.service;

import com.spring.security.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.spring.security.dto.SignUpDto;

public interface UserService extends UserDetailsService {
	public User save(SignUpDto signUpDto);
}