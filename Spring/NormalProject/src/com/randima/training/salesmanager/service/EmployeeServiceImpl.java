package com.randima.training.salesmanager.service;

import java.util.List;

import com.randima.training.salesmanager.model.Employee;
import com.randima.training.salesmanager.repository.EmployeeRepository;
import com.randima.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
//	EmployeeRepository employeeRepository=new HibernateEmployeeRepositoryImpl();
	EmployeeRepository employeeRepository; //After creating bean
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
		
	}
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}
	

}
