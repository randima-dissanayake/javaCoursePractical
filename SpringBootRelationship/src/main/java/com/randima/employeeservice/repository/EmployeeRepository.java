package com.randima.employeeservice.repository;

import com.randima.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.Repository;

//public interface EmployeeRepository extends Repository<Employee,Integer> {
//    Employee save(Employee employee);
//}

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
