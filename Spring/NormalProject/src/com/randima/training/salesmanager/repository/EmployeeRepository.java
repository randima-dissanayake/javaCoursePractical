package com.randima.training.salesmanager.repository;

import java.util.List;

import com.randima.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}