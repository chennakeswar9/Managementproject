package com.employee.managementproject.service;

import java.util.Arrays;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.employee.managementproject.dto.UserRegistrationDto;
import com.employee.managementproject.model.Role;
import com.employee.managementproject.model.User;
import com.employee.managementproject.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	
	private UserRepository userRepository;
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	public User save(UserRegistrationDto userRegistrationDto) {
		// TODO Auto-generated method stub
		User user= new User	(userRegistrationDto.getFirstName(),
					userRegistrationDto.getLastName(),
					userRegistrationDto.getEmail(),
					userRegistrationDto.getPassword(),Arrays.asList(new Role("ROLE_USER")));
		
		
		
		
		return userRepository.save(user);
	
	
	
	}

}
