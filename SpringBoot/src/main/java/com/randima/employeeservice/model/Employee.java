package com.randima.employeeservice.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int mark;

    Employee(String name, int mark){
        this.name=name;
        this.mark=mark;
    }
    public String getName() {
        return name;
    }

    public int getMarks() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int mark) {
        this.mark = mark;
    }

    public static List<Employee> getAllEmployees(){
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("randima", 70));
        employeeList.add(new Employee("thilini",12));
        employeeList.add(new Employee("primali",56));
        employeeList.add(new Employee("hansika",87));

        return employeeList;
    }
}
