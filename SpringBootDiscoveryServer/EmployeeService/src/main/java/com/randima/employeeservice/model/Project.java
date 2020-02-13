package com.randima.employeeservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    @ManyToMany(mappedBy = "projects", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Employee> employees;
}
