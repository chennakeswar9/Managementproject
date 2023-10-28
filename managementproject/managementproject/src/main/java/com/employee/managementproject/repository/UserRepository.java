package com.employee.managementproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.managementproject.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
