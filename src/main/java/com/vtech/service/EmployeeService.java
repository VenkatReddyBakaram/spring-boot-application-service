package com.vtech.service;

import org.springframework.stereotype.Service;

import com.vtech.models.Employee;

@Service
public class EmployeeService {

	public Employee getEmployee() {
		return new Employee(1234, "Venkat Reddy", "Technical Architect", 90000.50);
	}

}
