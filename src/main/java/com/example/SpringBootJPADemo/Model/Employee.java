package com.example.SpringBootJPADemo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "EmployeeDetails")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="customId")
    @SequenceGenerator(name = "customId",initialValue = 101,allocationSize = 1)
    private int empId;
    private String name;
    private String dept;
    private String role;

    public Employee() {
    }

    public Employee(int empId, String name, String dept, String role) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.role = role;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
