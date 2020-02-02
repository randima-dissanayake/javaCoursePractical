package com.randima.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.randima.training.salesmanager.model.Employee;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees= new ArrayList<>();
		
		Employee employee=new Employee();
		employee.setEmployeeName("Randima Dissanayake");
		employee.setEmployeeLocation("Kurunegala");
		employees.add(employee);
		return employees;
		
	}

}
