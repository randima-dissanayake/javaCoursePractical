package com.randima.training.salesmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.randima.training.salesmanager.model.Employee;
import com.randima.training.salesmanager.repository.EmployeeRepository;
import com.randima.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
//	EmployeeRepository employeeRepository=new HibernateEmployeeRepositoryImpl();
	EmployeeRepository employeeRepository; //After creating bean
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}
	
	public EmployeeServiceImpl() {
		System.out.println("Default constructor fired");
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
