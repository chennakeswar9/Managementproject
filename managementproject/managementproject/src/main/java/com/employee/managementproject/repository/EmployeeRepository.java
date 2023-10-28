package com.employee.managementproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.managementproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
