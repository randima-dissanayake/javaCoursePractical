package com.randima.training.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.randima.training.salesmanager.config.ApplicationConfiguration;
import com.randima.training.salesmanager.model.Employee;
import com.randima.training.salesmanager.service.EmployeeService;
import com.randima.training.salesmanager.service.EmployeeServiceImpl;

public class Application {
	public static void main(String args[]) {
		
		System.out.println("Java project");
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		EmployeeService employeeService=applicationContext.getBean("employeeService",EmployeeService.class);
		System.out.println(employeeService.toString());
		EmployeeService employeeService2=applicationContext.getBean("employeeService",EmployeeService.class);
		System.out.println(employeeService2.toString());
		List<Employee> employees= employeeService.getAllEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName()+ " at "+ employee.getEmployeeLocation());
		}
	}

}
