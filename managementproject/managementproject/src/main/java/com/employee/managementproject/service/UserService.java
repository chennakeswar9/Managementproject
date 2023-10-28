package com.employee.managementproject.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.employee.managementproject.dto.UserRegistrationDto;
import com.employee.managementproject.model.User;

public interface UserService extends UserDetailsService {
		User save(UserRegistrationDto userRegistrationDto);

}
