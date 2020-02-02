package com.randima.training.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.randima.training.salesmanager.repository.EmployeeRepository;
import com.randima.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.randima.training.salesmanager.service.EmployeeService;
import com.randima.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.randima")
@PropertySource("application.properties")
public class ApplicationConfiguration {
	
	@Bean(name="employeeService")
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		return employeeService;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
