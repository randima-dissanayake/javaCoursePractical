package com.randima.employeeservice.service;

import com.randima.employeeservice.model.Allocation;
import com.randima.employeeservice.model.Employee;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee find(Integer id);
    Allocation[] fetchAllocation(Employee employee);
}
