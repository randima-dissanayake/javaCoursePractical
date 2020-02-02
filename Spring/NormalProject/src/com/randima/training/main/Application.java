package com.randima.training.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.randima.training.salesmanager.model.Employee;
import com.randima.training.salesmanager.service.EmployeeService;
import com.randima.training.salesmanager.service.EmployeeServiceImpl;

public class Application {
	public static void main(String args[]) {
		//Before adding bean
//		EmployeeService employeeService=new EmployeeServiceImpl();
//		
//		List<Employee> employees= employeeService.getAllEmployees();
//		
//		for(Employee employee : employees) {
//			System.out.println(employee.getEmployeeName()+ " at "+ employee.getEmployeeLocation());
//		}
		
//		------------------------------------------------------------------------------------------------------
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService employeeService=applicationContext.getBean("employeeService",EmployeeService.class);
		List<Employee> employees= employeeService.getAllEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName()+ " at "+ employee.getEmployeeLocation());
		}
	}

}
