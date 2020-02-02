package com.randima.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.randima.training.salesmanager.model.Employee;
import com.randima.training.salesmanager.repository.EmployeeRepository;
import com.randima.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository; 
	
	public EmployeeServiceImpl() {
		
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
		
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}
	

}
