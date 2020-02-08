package com.randima.employeeservice.controller;

import com.randima.employeeservice.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

@RestController
@RequestMapping("/services")
@XmlRootElement
public class EmployeeController {
    @RequestMapping("/greeting")
    public void greeting(){
        System.out.println("Hello");
    }

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees(){
        return Employee.getAllEmployees();
    }

}
