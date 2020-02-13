package com.randima.employeeservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int marks;
    private Allocation[] allocations;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private List<Telephone> telephones;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name = "eid",referencedColumnName = "id"),
            inverseJoinColumns = {@JoinColumn(name = "pid", referencedColumnName = "id")}
    )
    private List<Project> projects;

    public Employee(Integer id, String name, int mark){
        this.id=id;
        this.name=name;
        this.marks=mark;
    }

    public Employee(){

    }


}
