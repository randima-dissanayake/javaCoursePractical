package com.randima.employeeservice.service;

import com.randima.employeeservice.model.Employee;
import com.randima.employeeservice.model.Telephone;
import com.randima.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(Employee employee){
        for (Telephone t: employee.getTelephones()){
            t.setEmployee(employee);
        }
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
