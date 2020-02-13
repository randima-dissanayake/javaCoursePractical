package com.randima.employeeservice.service;

import com.randima.employeeservice.model.Allocation;
import com.randima.employeeservice.model.Employee;
import com.randima.employeeservice.model.Telephone;
import com.randima.employeeservice.repository.EmployeeRepository;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Bean
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee){
        for (Telephone t: employee.getTelephones()){
            t.setEmployee(employee);
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee find(Integer id){
        Optional<Employee> employee= employeeRepository.findById(id);
        if (employee.isPresent()){
            Allocation[] allocations= fetchAllocation(employee.get());
            employee.get().setAllocations(allocations);
            return employee.get();
        }
        return null;
    }

    @Override
    public Allocation[] fetchAllocation(Employee employee) {
        HttpHeaders httpHeaders=new HttpHeaders();
        HttpEntity<String> httpEntity=new HttpEntity<>("",httpHeaders);
        ResponseEntity<Allocation[]> responseEntity=restTemplate.exchange("http://localhost:8181/services/allocation/"+employee.getId(),
                HttpMethod.GET,httpEntity,Allocation[].class);
        return responseEntity.getBody();
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
