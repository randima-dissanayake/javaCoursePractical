package com.randima.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.randima.training.salesmanager.model.Employee;
import com.randima.training.salesmanager.repository.EmployeeRepository;
import com.randima.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository; 
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overloaded constructor executed");
		this.employeeRepository=employeeRepository;
	}
	
	public EmployeeServiceImpl() {
		System.out.println("Default constructor executed");
	}

	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
		
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter executed");
		this.employeeRepository=employeeRepository;
	}
	

}
