package com.randima.employeeservice.controller;

import com.randima.employeeservice.model.Employee;
import com.randima.employeeservice.service.EmployeeService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

@RestController
@RequestMapping("/services")
@XmlRootElement
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/greeting")
    public void greeting(){
        System.out.println("Hello");
    }

    @RequestMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        return employeeService.find(id);
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

}
