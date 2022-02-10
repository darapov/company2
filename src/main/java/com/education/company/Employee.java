package com.education.company;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private String  phone;
    private long salary;

    public Employee(String name, String phone, long salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

}
