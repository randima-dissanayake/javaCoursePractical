package com.randima.training.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.randima.training.salesmanager.repository.EmployeeRepository;
import com.randima.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.randima.training.salesmanager.service.EmployeeService;
import com.randima.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.randima")
public class ApplicationConfiguration {
	
	@Bean(name="employeeService")
	@Scope("singleton")
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		return employeeService;
	}
	
//	@Bean(name="employeeRepository")   //remove this bean for setter injection
//	public EmployeeRepository getEmployeeRepository() {
//		return new HibernateEmployeeRepositoryImpl();
//	}

}
